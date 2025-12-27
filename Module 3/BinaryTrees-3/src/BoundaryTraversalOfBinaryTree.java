import java.util.*;

class Node {

    int data;
    Node left, right;
}

class Solution {
    static void printBoundary(Node node) {
        if (node == null) return;
        System.out.print(node.data + " ");

        printLeftBoundary(node);
        printLeaf(node);
        printRightBoundary(node); // reverse
    }

    private static void printLeaf(Node node) {
        if(node==null) return;
        if(isLeaf(node)) {
            System.out.print(node.data + " ");
            return;
        }

        printLeaf(node.left);
        printLeaf(node.right);
    }

    private static void printRightBoundary(Node node) {
        Node curr = node.right;
        ArrayList<Integer> rightPath = new ArrayList<>();

        while (curr != null) {
            if (!isLeaf(curr)) {
                rightPath.add(curr.data);
            }
            if (curr.right != null) curr = curr.right;
            else curr = curr.left;
        }

        for(int i=rightPath.size()-1;i>=0;i--) {
            System.out.print(rightPath.get(i) + " ");
        }
    }



    public static boolean isLeaf(Node node) {
        return node.left == null && node.right == null;
    }

    private static void printLeftBoundary(Node node) {
        Node curr = node.left;

        while (curr != null) {
            if (!isLeaf(curr)) {
                System.out.print(curr.data + " ");
            }
            if (curr.left != null) curr = curr.left;
            else curr = curr.right;
        }
    }
}

public class Main {

    static Node getNode(int data) {
        // Allocate memory
        Node newNode = new Node();

        // put in the data
        newNode.data = data;
        newNode.left = newNode.right = null;
        return newNode;
    }

    static Node LevelOrder(Node root, int data) {
        if (root == null) {
            root = getNode(data);
            return root;
        }
        if (data <= root.data) root.left =
                LevelOrder(root.left, data);
        else root.right =
                LevelOrder(root.right, data);
        return root;
    }

    static Node constructBst(int arr[], int n) {
        if (n == 0) return null;
        Node root = null;

        for (int i = 0; i < n; i++) root = LevelOrder(root, arr[i]);

        return root;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] tree = new int[n];
        for (int i = 0; i < n; i++) tree[i] = sc.nextInt();
        sc.close();
        Node root = constructBst(tree, n);
        Solution.printBoundary(root);
    }
}
