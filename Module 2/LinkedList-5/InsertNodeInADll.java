import java.util.*;
import java.io.*;

class Node{
    int data;
    Node next;
    Node prev;
    Node(int data){
        this.data = data;
        next = null;
        prev = null;
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
    static Node insertAtHead(Node head,int K) {
        Node newNode = new Node(K);
        if(head==null) {
            head = newNode;
            return head;
        }
        head.prev = newNode;
        newNode.next = head;
        head = newNode;
        return head;
    }

    static Node insertAtEnd(Node head, int K) {
        Node newNode = new Node(K);
        if(head==null) {
            head = newNode;
            return head;
        }

        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;

        return head;


    }
}

public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        LinkedList list = new LinkedList();
        for (int i = 0; i < N; i++) {
            list.add(sc.nextInt());
        }
        Node head = Solution.insertAtHead(list.head,K);
        while (head != null) {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
}