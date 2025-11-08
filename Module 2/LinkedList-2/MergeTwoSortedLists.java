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
    static Node merge(Node x, Node y){
        Node dummy = new Node(-200);
        Node currX = x;
        Node currY = y;
        Node currDummy = dummy;

        while(currX!=null && currY!=null) {
            if(currX.data < currY.data) {
                Node newNode = new Node(currX.data);
                currDummy.next = newNode;
                currX = currX.next;
            }
            else {
                Node newNode = new Node(currY.data);
                currDummy.next = newNode;
                currY = currY.next;
            }
            currDummy = currDummy.next;
        }

        if(currX!=null) currDummy.next = currX;

        if(currY!=null) currDummy.next = currY;

        return dummy.next;

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
        int m = sc.nextInt();
        LinkedList l2 = new LinkedList();
        for(int i=0;i<m;i++){
            l2.add(sc.nextInt());
        }

        Solution Ob = new Solution();
        Node head = Ob.merge(l1.head, l2.head);
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}