import java.util.*;

class Solution {
    public static Node findMid(Node head) {
        if(head.next==null) return head;

        Node slow = head;
        Node fast = head;
        while(fast.next!=null && fast.next.next!=null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node merge(Node head1, Node head2) {
        Node dummy = new Node(-1);
        Node currDummy = dummy;

        Node dummyHead1 = head1;
        Node dummyHead2 = head2;

        while(dummyHead1!=null && dummyHead2!=null) {
            if(dummyHead1.data < dummyHead2.data) {
                currDummy.next = dummyHead1;
                dummyHead1 = dummyHead1.next;
            }
            else {
                currDummy.next = dummyHead2;
                dummyHead2 = dummyHead2.next;
            }

            currDummy = currDummy.next;
        }

        if(dummyHead1!=null) currDummy.next = dummyHead1;
        if(dummyHead2!=null) currDummy.next = dummyHead2;

        return dummy.next;
    }

    public static Node mergesort(Node head){
        if(head==null || head.next==null) return head;

        // Step 1 - Find mid
        Node mid = findMid(head);
        Node head1 = head;
        Node head2 = mid.next;
        mid.next = null;

        head1 = mergesort(head1);
        head2 = mergesort(head2);

        //merge
        Node newHead = merge(head1, head2);
        return newHead;
    }
}


class Node{
    int data;
    Node next = null;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node curr = head;
        while(curr.next != null)
            curr = curr.next;
        curr.next = new_node;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        LinkedList a = new LinkedList();
        for(int i = 0; i < n; i++){
            a.add(input.nextInt());
        }
        Solution Obj = new Solution();
        a.head = Obj.mergesort(a.head);
        Node h = a.head;
        while(h != null){
            System.out.print(h.data + " ");
            h = h.next;
        }
    }
}
