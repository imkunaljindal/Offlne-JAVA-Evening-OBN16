import java.util.*;
class Node
{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

class Main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Node head=null;
        Node phead=null;
        int n=sc.nextInt();
        while(n-->0){
            int n1=sc.nextInt();
            if(head==null)
                head=new Node(n1);
            else
                addHead(head,n1);
        }
        int m=sc.nextInt();
        while(m-->0){
            int n1=sc.nextInt();
            if(phead==null)
                phead=new Node(n1);
            else{
                addHead(phead,n1);
            }
        }
        Solution g=new Solution();
        System.out.println(g.multiplyLists(head,phead));
    }

    public static void addHead(Node node,int a) {
        if (node == null)
            return;
        if(node.next==null)
            node.next=new Node(a);
        else
            addHead(node.next,a);
    }
}

class Solution{
    public long multiplyLists(Node l1,Node l2) {
        long m = 1000000007;
       long a = 0;
       Node currA = l1;
       while(currA!=null) {
           a = (a*10 + currA.data)%m;
           currA = currA.next;
       }
        long b = 0;
        Node currB = l2;
        while(currB!=null) {
            b = (b*10 + currB.data)%m;
            currB = currB.next;
        }

        return ((a%m)*(b%m))%m;
    }
}
