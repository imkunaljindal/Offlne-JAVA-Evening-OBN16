import java.io.*;
import java.util.*;

class Pair{
    int val;
    int idx;
    Pair(int val, int idx){
        this.val = val;
        this.idx = idx;
    }
}

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int a[] = new int[n];
        for(int i = 0; i < n; i++){
            a[i] = input.nextInt();
        }
        Solution s  = new Solution();
        int ans[] = s.stockSpan(a);
        for(int i = 0; i < n; i++){
            System.out.print(ans[i] + " ");
        }
    }
}

class Solution {
    static int[] stockSpan(int[] a) {
        int n = a.length;
        int ans[] = new int[n];
        Stack<Integer> st = new Stack<>();

        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && a[st.peek()] < a[i]) {
                ans[st.peek()] = st.peek()-i;
                st.pop();
            }
            st.push(i);
        }

        while(!st.isEmpty()) {
            ans[st.peek()] = st.peek()+1;
            st.pop();
        }
        return ans;
    }
}