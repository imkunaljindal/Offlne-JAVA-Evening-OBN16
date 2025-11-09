import java.util.*;

class Main{

    static Node head1 = null;
    static Node head2 = null;


    static class Node
    {
        int data;
        Node next;
        Node(int x)
        {
            data = x;
            next = null;
        }
    }

    static Node intersectingNode(Node headA, Node headB)
    {
       Node currA = headA;
       Node currB = headB;

       while(currB!=currA) {
           currA = currA.next;
           if(currA==null) currA = headB;

           currB = currB.next;
           if(currB==null) currB = headA;
       }

       return currA;
    }

    static void formLinkList(int n,int m,int k,int[] a, int[] b)
    {
        head1= new Node(a[0]);
        Node temp =head1;
        int i=1;
        Node need= null;
        while(i<n){
            temp.next = new Node(a[i]);
            temp=temp.next;
            if(i==k) need = temp;
            i++;
        }

        head2 = new Node(b[0]);
        i=1;
        temp = head2;
        while(i<m){
            temp.next = new Node(b[i]);
            temp=temp.next;
            i++;
        }
        temp.next=need;
        return;
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int t=0;
        t = sc.nextInt();
        while(t-->0){
            head1=null;
            head2=null;
            int n=0,m=0,k=0;
            n = sc.nextInt();
            m = sc.nextInt();
            k = sc.nextInt();
            int[] a  =new int[n];
            int[] b  =new int[m];
            for(int i=0;i<n;i++){
                a[i]=sc.nextInt();
            }
            for(int i=0;i<m;i++){
                b[i]=sc.nextInt();
            }
            formLinkList(n,m,k,a,b);
            System.out.println(Math.abs(intersectingNode(head1, head2).data));
        }
        sc.close();
        return;
    }
}
