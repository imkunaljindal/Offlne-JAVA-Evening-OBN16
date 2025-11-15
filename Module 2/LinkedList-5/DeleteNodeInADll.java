import java.util.*;

class Node {
    int val;
    Node prev;
    Node next;

    Node(int val) {
        this.val = val;
        this.prev = null;
        this.next = null;
    }
}

class DoublyLinkedList {
    Node head;
    Node tail;
    int length;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.length = 0;
    }

    void append(int val) {
        Node newNode = new Node(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.tail.next = newNode;
            newNode.prev = this.tail;
            this.tail = newNode;
        }
        this.length++;
    }

    void prepend(int val) {
        Node newNode = new Node(val);
        if (this.length == 0) {
            this.head = newNode;
            this.tail = newNode;
        } else {
            this.head.prev = newNode;
            newNode.next = this.head;
            this.head = newNode;
        }
        this.length++;
    }

    void printList() {
        Node curr = this.head;
        while (curr != null) {
            System.out.print(curr.val + " ");
            curr = curr.next;
        }
        System.out.println();
    }

    void deleteNode(Node node) {
        if (head == null) return;
        else if (head == tail) {
            head = null;
            tail = null;
        } else if (head == node) {
            head = head.next;
            head.prev = null;
        } else if (tail == node) {
            tail = tail.prev;
            tail.next = null;
        } else {
            node.prev.next = node.next;
            node.next.prev = node.prev;
        }
        this.length--;
    }
}

class Solution {
    public static DoublyLinkedList deleteNodeWithX(DoublyLinkedList linkedList, int x) {
        //Write your code here
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        DoublyLinkedList linkedList = new DoublyLinkedList();
        for (int i = 0; i < N; i++) {
            linkedList.append(sc.nextInt());
        }
        Solution Obj = new Solution();
        linkedList = Obj.deleteNodeWithX(linkedList, M);
        linkedList.printList();

    }
}