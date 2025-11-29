import java.util.*;

class Solution {
    static LinkedListNode<Integer> reverse(LinkedListNode<Integer> head){
        LinkedListNode<Integer> curr = head, prev = null, nxt;
        while(curr != null){
            nxt = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nxt;
        }
        return prev;
    }
    static LinkedListNode<Integer> reverseAlternateNodes(LinkedListNode<Integer> head){
        if(head == null || head.next == null || head.next.next == null){
            return head;
        }
        int idx = 0;
        LinkedListNode<Integer> temp = head;
        LinkedListNode<Integer> oddHead = null, evenHead = null;
        LinkedListNode<Integer> oddTemp = null, evenTemp = null;
        while(temp != null){
            LinkedListNode<Integer> nxt = temp.next;
            temp.next = null;
            if(idx%2 == 0){
                if(evenHead == null){
                    evenHead = temp;
                    evenTemp = temp;
                }else{
                    evenTemp.next = temp;
                    evenTemp = evenTemp.next;
                }
            }else{
                if(oddHead == null){
                    oddHead = temp;
                    oddTemp = temp;
                }else{
                    oddTemp.next = temp;
                    oddTemp = oddTemp.next;
                }
            }
            idx++;
            temp = nxt;
        }
        LinkedListNode<Integer> reverseOdd = reverse(oddHead);
        evenTemp.next = reverseOdd;
        return evenHead;
    }
}

class LinkedListNode<T>  {
    T data;
    LinkedListNode<T> next;

    public LinkedListNode(T data)  {
        this.data = data;
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        LinkedListNode<Integer> head = new LinkedListNode<Integer>(sc.nextInt());
        LinkedListNode<Integer> a = head;
        for(int i=1;i<n;i++) {
            LinkedListNode<Integer> temp = new LinkedListNode<Integer>(sc.nextInt());
            a.next = temp;
            a = temp;
        }
        LinkedListNode<Integer> ans = Solution.reverseAlternateNodes(head);
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

