import java.util.*;
import java.lang.*;
import java.io.*;

class Solution
{
    public static long[] nextLargerElement(long[] arr, int n)
    {
        // Approach 1 - Potential Next Greater Element
        /**Stack<Long> st = new Stack<>();
        long ans[] = new long[n];

        ans[n-1] = -1;
        st.push(arr[n-1]);

        for(int i=n-2;i>=0;i--) {
            while(!st.isEmpty() && st.peek() <= arr[i]) {
                st.pop();
            }
            if(st.isEmpty()) ans[i] = -1;
            else ans[i] = st.peek();
            st.push(arr[i]);
        }

        return ans;**/

        // Approach 2 - Elements looking for their NGE
        long ans[] = new long[n];
        Stack<Integer> st = new Stack<>();

        for(int i=0;i<n;i++) {
            while(!st.isEmpty() && arr[st.peek()] < arr[i]) {
                ans[st.peek()] = arr[i];
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
}
class Main {
    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        long[] arr = new long[n];
        for(int i=0; i<n; i++)arr[i]=Long.parseLong(inputLine[i]);
        long[] res = new Solution().nextLargerElement(arr, n);
        for (int i = 0; i < n; i++)
            System.out.print(res[i] + " ");
        System.out.println();
    }
}