import java.util.*;
import java.io.*;

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
//    public static void reverse(Node curr){
//        if(curr==null) return;
//        reverse(curr.next);
//        System.out.print(curr.data + " ");
//    }

    public static Node reverseActual(Node head) {
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
    public static void reverse(Node curr){
       Node reversedHead = reverseActual(curr);
       Node temp = reversedHead;
       while(temp!=null) {
           System.out.print(temp.data + " ");
           temp = temp.next;
       }

    }

    public static void main(String args[]){
        Scanner input = new Scanner(System.in);
        LinkedList list = new LinkedList();
        int n = input.nextInt();
        for(int i = 0; i < n; i++){
            int x = input.nextInt();
            list.add(x);
        }
        reverse(list.head);
        System.out.println("");
    }
}