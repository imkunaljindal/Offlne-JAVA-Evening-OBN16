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
        Node zeros = new Node(-1);
        Node ones = new Node(-1);
        Node twos = new Node(-1);

        Node curr = head;
        Node currZeros = zeros;
        Node currOne = ones;
        Node currTwos = twos;

        while(curr!=null) {
            if(curr.data == 0) {
                currZeros.next = curr;
                currZeros = currZeros.next;
            }
            else if(curr.data == 1) {
                currOne.next = curr;
                currOne = currOne.next;
            }
            else {
                currTwos.next = curr;
                currTwos = currTwos.next;
            }
            curr = curr.next;
        }

        currZeros.next = null;
        currOne.next = null;
        currTwos.next = null;

        currZeros.next = ones.next;
        currOne.next = twos.next;

        Node temp = zeros.next;
        while(temp!=null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
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