import java.util.*;

class Solution {
    static LinkedListNode sort01(LinkedListNode head){
        int cnt0 = 0;
        int cnt1 = 0;

        LinkedListNode curr = head;
        while(curr!=null) {
            if(curr.data == 0) cnt0++;
            else cnt1++;
            curr = curr.next;
        }

        curr = head;
        for(int i=0;i<cnt0;i++) {
            curr.data = 0;
            curr = curr.next;
        }

        for(int i=0;i<cnt1;i++) {
            curr.data = 1;
            curr = curr.next;
        }

        return head;
    }
}

class LinkedListNode  {
    int data;
    LinkedListNode next;

    public LinkedListNode(int data)  {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode head = new LinkedListNode(sc.nextInt());
        LinkedListNode a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode temp = new LinkedListNode(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode ans = Solution.sort01(head);
        for(int i=0;i<n;i++) {
            if(i == n-1) {
                System.out.println(ans.data);
            }
            else {
                System.out.print(ans.data + " ");
            }
            ans = ans.next;
        }
    }
}