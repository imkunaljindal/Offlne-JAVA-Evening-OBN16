import java.util.LinkedList;
import java.util.Queue;
import java.io.*;
import java.util.*;
import java.lang.*;

class TreeNode{
    int data;
    TreeNode left;
    TreeNode right;
    TreeNode(int data){
        this.data = data;
        left=null;
        right=null;
    }
}

class Pair {
    TreeNode node;
    int y;
    public Pair(TreeNode node, int y) {
        this.node = node;
        this.y = y;
    }
}

class Solution {
    List<List<Integer>> VerticalTraversal(TreeNode root) {
        Queue<Pair> q = new ArrayDeque<>();
        q.add(new Pair(root,0));
        Map<Integer, ArrayList<Integer>> mp = new TreeMap<>();

        while(!q.isEmpty()) {
            int sz = q.size();
            for(int i=0;i<sz;i++) {
                Pair p = q.poll();
                TreeNode curr = p.node;
                int y = p.y;

                if(!mp.containsKey(y)) mp.put(y,new ArrayList<>());
                ArrayList<Integer> currNodes = mp.get(y); 
                currNodes.add(curr.data);
                mp.put(y,currNodes);

                if(curr.left!=null) q.add(new Pair(curr.left,y-1));
                if(curr.right!=null) q.add(new Pair(curr.right,y+1));
            }
        }

        List<List<Integer>> ans = new ArrayList<>();
        for(ArrayList<Integer> nodes: mp.values()) {
            ans.add(nodes);
        }

        return ans;
    }
}

class Main {

    static TreeNode buildTree(String str) {
        if(str.length()==0 || str.charAt(0)=='N')
            return null;

        String ip[] = str.split(" ");
        TreeNode root = new TreeNode(Integer.parseInt(ip[0]));
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int i = 1;
        while(queue.size()>0 && i < ip.length) {
            TreeNode currNode = queue.peek();
            queue.remove();
            String currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.left = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.left);
            }
            i++;
            if(i >= ip.length)
                break;
            currVal = ip[i];
            if(!currVal.equals("N")) {
                currNode.right = new TreeNode(Integer.parseInt(currVal));
                queue.add(currNode.right);
            }
            i++;
        }
        return root;
    }

    public static void main (String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t > 0){
            String s = br.readLine();
            TreeNode root = buildTree(s);
            Solution ob = new Solution();
            List<List<Integer>> ans = ob.VerticalTraversal(root);
            for(int i = 0; i < ans.size(); i++) {
                for(int a : ans.get(i)) {
                    System.out.print(a + " ");
                }
                System.out.println();
            }
            System.out.println();
            t--;
        }
    }
}