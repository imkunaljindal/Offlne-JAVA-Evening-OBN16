import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cap = sc.nextInt(), q = sc.nextInt();
        String[] queries = new String[q];
        for (int i = 0; i < q; i++) {
            String s = sc.next();
            if (s.equals("GET"))
                s += " " + sc.nextInt();
            else
                s += " " + sc.nextInt() + " " + sc.nextInt();
            queries[i] = s;
        }
        sc.close();
        LRUCache lruCache = new LRUCache(cap);
        for (String s : queries) {
            String[] arr = s.split(" ");
            if (arr.length == 3)
                lruCache.set(Integer.parseInt(arr[1]), Integer.parseInt(arr[2]));
            else
                System.out.println(lruCache.get(Integer.parseInt(arr[1])));
        }
    }
}

class Node {
    int key;
    int value;
    Node next;
    Node prev;
    Node(int key, int value) {
        this.key = key;
        this.value = value;
    }
}

class LRUCache {

    // <key, Node>
    HashMap<Integer,Node> nodeMap;
    Node head;
    Node tail;
    int capacity;

    public LRUCache(int capacity) {
        nodeMap = new HashMap<>();
        head = new Node(-1,-1);
        tail = new Node(-1,-1);
        head.next = tail;
        tail.prev = head;
        this.capacity = capacity;
    }

    public int get(int key) {
        if(!nodeMap.containsKey(key)) return -1;

        Node node = nodeMap.get(key);
        delete(node);
        insertAtHead(node);
        return node.value;
    }

    public void set(int key, int value) {
        if(!nodeMap.containsKey(key)) {
            // new node
            if(nodeMap.size()>=this.capacity) {
                // lru evict
                Node lru = tail.prev;
                delete(lru);
                nodeMap.remove(lru.key);
            }
            Node newNode = new Node(key,value);
            insertAtHead(newNode);
            nodeMap.put(key,newNode);
        }
        else {
            // exiting node
            Node node = nodeMap.get(key);
            delete(node);
            node.value = value;
            insertAtHead(node);
            nodeMap.put(key,node);
        }
    }

    public void insertAtHead(Node node) {
        node.next = head.next;
        head.next.prev = node;
        head.next = node;
        node.prev = head;
    }

    public void delete(Node node) {
        node.prev.next = node.next;
        node.next.prev = node.prev;
    }

}