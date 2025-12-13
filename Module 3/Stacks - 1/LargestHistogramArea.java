import java.util.*;
import java.lang.*;
import java.io.*;

class Main {


    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[(int)n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        System.out.println(new Solution().maximumArea(arr, n));
    }
}

class Solution {

    public static long[] nextSmallerOnLeft(long hist[], long n) {
        int length = hist.length;
        long ans[] = new long[length];
        Stack<Integer> st = new Stack<>();
        for(int i=length-1;i>=0;i--) {
            while(!st.isEmpty() && hist[st.peek()] > hist[i]) {
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

    public static long[] nextSmallerOnRight(long hist[], long n) {
        int length = hist.length;
        long ans[] = new long[length];
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<length;i++) {
            while(!st.isEmpty() && hist[st.peek()] > hist[i]) {
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

    public static long maximumArea(long hist[], long n) {

        long nsl[] = nextSmallerOnLeft(hist,n);
        long nsr[] = nextSmallerOnRight(hist,n);

        long ans = -1;
        for(int i=0;i<n;i++) {
            long widht = nsr[i] - nsl[i] - 1;
            long height = hist[i];
            ans = Math.max(ans,height*widht);
        }

        return ans;
    }
}