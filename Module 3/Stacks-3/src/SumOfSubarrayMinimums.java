import java.io.*;
import java.util.*;

class Solution{
    public int[] nextSmallerOnLeft(int a[], int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i=n-1;i>=0;i--) {
            while(!st.isEmpty() && a[st.peek()] > a[i]) {
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            ans[st.peek()] = -1;
            st.pop();
        }
        return ans;
    }

    public int[] nextSmallerOnRight(int a[], int n) {
        Stack<Integer> st = new Stack<>();
        int ans[] = new int[n];
        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && a[st.peek()] >= a[i]) {
                ans[st.peek()] = i;
                st.pop();
            }
            st.push(i);
        }
        while(!st.isEmpty()) {
            ans[st.peek()] = n;
            st.pop();
        }
        return ans;
    }

    public long minSubarraySum(int n, int a[]){
        long mod = 1000000007;
        int nsl[] = nextSmallerOnLeft(a,n);
        int nsr[] = nextSmallerOnRight(a,n);

        long sum = 0;
        for(int i=0;i<n;i++) {
            long totalSubarrays = (i-nsl[i])*(nsr[i]-i);
            sum += ((totalSubarrays%mod)*a[i]);
        }
        return sum%mod;
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
        Solution Obj = new Solution();
        System.out.println(Obj.minSubarraySum(n,a));
    }
}