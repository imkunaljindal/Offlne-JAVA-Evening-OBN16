import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

class Main {
    static Node buildTree(String str) {
        if (str.length() == 0 || str.charAt(0) == 'N') {
            return null;
        }
        String ip[] = str.split(" ");
        Node root = new Node(Integer.parseInt(ip[0]));
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while (queue.size() > 0 && i < ip.length) {
            Node currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.left = new Node(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if (i >= ip.length) break;
            currVal = ip[i];
            if (!currVal.equals("N")) {
                currNode.right = new Node(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }

        return root;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        String s1 = br.readLine();
        Node root1 = buildTree(s1);
        Solution g = new Solution();
        g.binaryTreeZigZagTraversal(root1);
    }
}


class Node {
    int data;
    Node left;
    Node right;
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {
    public static void binaryTreeZigZagTraversal(Node root) {
        Queue<Node> q = new ArrayDeque<>();

        q.add(root);
        int level = 0;

        while(!q.isEmpty()) {
            int sz = q.size();
            List<Integer> ele = new ArrayList<>();
            for(int i=0;i<sz;i++) {
                Node n = q.poll();
                ele.add(n.data);

                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
            if(level%2==0) {
                for(int x: ele) System.out.print(x + " ");
            }
            else {
                for(int i=ele.size()-1;i>=0;i--)
                    System.out.print(ele.get(i) + " ");
            }
            level++;
        }
    }
}