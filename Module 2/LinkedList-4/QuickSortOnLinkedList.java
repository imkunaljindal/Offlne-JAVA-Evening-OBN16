
import java.util.*;
class Node {
    int data;
    Node next;

    Node(int key) {
        data = key;
        next = null;
    }
}

class Main {
    static Node head;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a1 = sc.nextInt();
        Node head = new Node(a1);
        addToTheLast(head);

        for (int i = 1; i < n; i++) {
            int a = sc.nextInt();
            addToTheLast(new Node(a));
        }

        Solution abc=new Solution();
        Node node = abc.quickSort(head);

        printList(node);
        System.out.println();

        sc.close();
    }

    public static void printList(Node head) {
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void addToTheLast(Node node) {
        if (head == null) {
            head = node;
        } else {
            Node temp = head;
            while (temp.next != null)
                temp = temp.next;
            temp.next = node;
        }
    }
}

class Solution {

    public static int size(Node head) {
        int cnt = 0;
        Node curr = head;
        while(curr!=null) {
            cnt++;
            curr = curr.next;
        }
        return cnt;
    }

    public static Node quickSort(Node node)
    {
        if(node==null || node.next==null) return node;

        // Step 1 -> convert list into array
        int n = size(node);
        int arr[] = new int[n];
        Node curr = node;
        for(int i=0;i<n;i++) {
            arr[i] = curr.data;
            curr = curr.next;
        }

        // Step 2 -> Quick Sort
        //quickS();

        // Step 3 -> convert sorted array to linked list
        Node dummy = new Node(-1);
        Node currDummy = dummy;

        for(int i=0;i<n;i++) {
            currDummy.next = new Node(arr[i]);
            currDummy = currDummy.next;
        }

        return dummy.next;

    }

}