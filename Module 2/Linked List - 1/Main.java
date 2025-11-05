class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}

class LinkedList {
    Node head;
    // insert
    // O(n)
    void insertAtLast(int data) {

        // empty list
        if(head==null) {
            Node newNode = new Node(data);
            head = newNode;
            return;
        }

        // size one list
        if(head.next==null) {
            Node newNode = new Node(data);
            head.next = newNode;
            return;
        }

        Node curr = head;
        while(curr.next!=null) {
            curr = curr.next;
        }
        // curr is on last node
        Node newNode = new Node(data);
        curr.next = newNode;
    }

    void deleteLast() {
        // O(n)
        if(head==null) {
            return;
        }

        if(head.next==null) {
            head = null;
            return;
        }

        Node curr = head;
        while(curr.next.next!=null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    void print() {
        // O(n)
        Node curr = head;
        while(curr!=null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    int size() {
        // O(n)
        Node curr = head;
        int count = 0;
        while(curr!=null) {
           count++;
            curr = curr.next;
        }
        return count;
    }

    boolean isEmpty() {
        // O(1)
        return head==null;
    }
}

public class Main {
    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        System.out.println(l.head);

        l.insertAtLast(10);
        l.insertAtLast(20);
        l.insertAtLast(30);
        l.insertAtLast(40);

        l.print();

        l.deleteLast();
        l.deleteLast();
        l.deleteLast();
        l.deleteLast();

        l.print();

    }
}
