import java.util.*;

class Node{
    int val;
    Node left, right;
    Node(int val){
        this.val = val;
        left = null;
        right = null;
    }
}


class BST{
    Node root = null;
    BST(){

    }
    Node insert(Node root, int val){
        if(root == null){
            root = new Node(val);
            return root;
        }
        if(val < root.val){
            root.left = insert(root.left, val);
        }else{
            root.right = insert(root.right, val);
        }
        return root;
    }
}

public class Main {

    public static List<Integer> levelOrderTraversal(Node root){
        Queue<Node> q = new ArrayDeque<>();
        q.add(root);
        List<Integer> ans = new ArrayList<>();

        while(!q.isEmpty()) {
            int sz = q.size();
            for(int i=0;i<sz;i++) {
                Node n = q.poll();
                ans.add(n.val);

                if(n.left!=null) q.add(n.left);
                if(n.right!=null) q.add(n.right);
            }
        }

        return ans;

    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        BST t = new BST();
        for(int i = 0; i < n; i++){
            t.root = t.insert(t.root, input.nextInt());
        }

        List<Integer> list = levelOrderTraversal(t.root);

        for(int val : list){
            System.out.print(val+ " ");
        }

    }
}