import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;

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
            if (i >= ip.length)
                break;
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
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String s = sc.nextLine();
        Node root = buildTree(s);
        Solution tree = new Solution();
        int ans = tree.solve(root);
        System.out.println(ans);

        sc.close();
    }
}

class Pair {
    Node node;
    int idx;
    public Pair(Node node, int idx) {
        this.node = node;
        this.idx = idx;
    }
}

class Solution {

    public int solve(Node root) {
        Queue<Pair> q = new ArrayDeque<>();
        int maxWidth = -1;

        q.add(new Pair(root,1));
        while(!q.isEmpty()) {
            int sz = q.size();
            int firstIdx = -1;
            int lastIdx = -1;
            for(int i=0;i<sz;i++) {
                Pair p = q.poll();
                Node currNode = p.node;
                int currIdx = p.idx;
                if(i==0) firstIdx = currIdx;
                if(i==sz-1) lastIdx = currIdx;

                if(currNode.left!=null) q.add(new Pair(currNode.left,2*currIdx));
                if(currNode.right!=null) q.add(new Pair(currNode.right,2*currIdx+1));
            }

            maxWidth = Math.max(maxWidth,lastIdx-firstIdx+1);
        }

        return maxWidth;
    }
}
