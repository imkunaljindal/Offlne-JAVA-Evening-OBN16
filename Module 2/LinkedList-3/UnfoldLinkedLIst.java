import java.io.*;
import java.util.*;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
        next = null;
    }
}
class LinkedList{
    Node head;
    void add(int data ){
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
            return;
        }
        Node current = head;
        while(current.next !=null){
            current = current.next;
        }
        current.next = new_node;
    }
}

class Solution {
    static void unfold(Node head)
    {
        Node firstHalf = new Node(-1);
        Node secondHalf = new Node(-1);

        Node curr = head;
        Node currFirst = firstHalf;
        Node currSecond = secondHalf;
        int idx = 0;

        while(curr!=null) {
            if(idx%2==0) {
                currFirst.next = curr;
                currFirst = currFirst.next;
            }
            else {
                currSecond.next = curr;
                currSecond = currSecond.next;
            }
            idx++;
            curr = curr.next;
        }

        // reverse second half
        secondHalf = reverse(secondHalf.next);

        currFirst.next = secondHalf;

        Node temp = firstHalf.next;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        Node nextNode;

        while(curr!=null) {
            nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        return prev;
    }
}
public class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedList l1= new LinkedList();
        for(int i=0;i<n;i++){
            l1.add(sc.nextInt());
        }
        Solution Ob = new Solution();
        Ob.unfold(l1.head);
    }
}