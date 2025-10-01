import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static int[] twoSum(int[] A, int target) {
        int left = 0;
        int right = A.length-1;

        while(left < right) {
            int sum = A[left] + A[right];
            if(sum==target) {
                int ans[] = new int[2];
                ans[0] = left+1;
                ans[1] = right+1;
                return ans;
            }
            if(sum > target) right--;
            else left++;
        }

        return new int[]{-1,-1};
    }

    public static void main (String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long n = Long.parseLong(br.readLine().trim());
        String inputLine[] = br.readLine().trim().split(" ");
        int[] arr = new int[(int)n];
        for(int i=0; i<n; i++)arr[i]=Integer.parseInt(inputLine[i]);
        int m = Integer.parseInt(br.readLine().trim());
        int[] ans = (twoSum(arr, m));
        System.out.println(ans[0] + " " + ans[1]);
    }
}



