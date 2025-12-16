import java.util.*;

class Node {
    int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }
}

class Queue {
    Node head;
    Node tail;
    int size;
    public void push(int value) {
        if(head==null) {
            Node n = new Node(value);
            head = n;
            tail = n;
        }
        else {
            Node n = new Node(value);
            tail.next = n;
            n.prev = tail;
            tail = tail.next;
        }
        size++;
    }
    public int pop() {
        if(head==null) return -1;
        int val = head.val;
        head = head.next;
        size--;
        return val;
    }
    public int front() {
        return head.val;
    }
    public int getSize() {
        return this.size;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Queue q = new Queue();
        int n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            int op = sc.nextInt();
            if(op == 1) {
                int x = sc.nextInt();
                q.push(x);
            }
            else if(op == 2) {
                System.out.println(q.pop());
            }
            else if(op == 3)
                System.out.println(q.front());
            else if(op == 4)
                System.out.println(q.getSize());
        }
    }
}