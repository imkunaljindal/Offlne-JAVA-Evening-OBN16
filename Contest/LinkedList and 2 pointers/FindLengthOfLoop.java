import java.util.*;
import java.io.*;
import java.lang.*;

class Node
{
    int data;
    Node next;

    Node(int x)
    {
        data = x;
        next = null;
    }
}

class Main
{
    public static void makeLoop(Node head, Node tail, int x){
        if (x == 0) return;

        Node curr = head;
        for(int i=1; i<x; i++)
            curr = curr.next;

        tail.next = curr;
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int num = sc.nextInt();
        Node head = new Node(num);
        Node tail = head;

        for(int i=0; i<n-1; i++)
        {
            num = sc.nextInt();
            tail.next = new Node(num);
            tail = tail.next;
        }

        int pos = sc.nextInt();
        makeLoop(head, tail, pos);
        Solution x = new Solution();
        System.out.print(x.countNodesinLoop(head));
    }
}
class Solution{
    public static int countNodesinLoop(Node head)
    {
        //Write your code here.
        Node fast = head.next;
        Node slow = head;

        while( fast!=slow )
        {
            //if the node pointed by first pointer(fast) or the node 
            //next to it is null, then loop is not present so we return 0.
            if( fast==null || fast.next==null )
                return 0;

            fast = fast.next.next;
            slow = slow.next;
        }
        //both pointers now point to the same node in the loop.

        int size = 1;
        fast = fast.next;
        //we start iterating the loop with first pointer and continue till 
        //both pointers point to same node again.
        while( fast!=slow )
        {
            fast = fast.next;
            //incrementing the counter.
            size+=1;
        }
        //returning the length of the loop.
        return size;

    }
}