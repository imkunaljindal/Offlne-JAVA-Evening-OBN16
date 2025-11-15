import java.util.*;
import java.lang.*;
import java.io.*;

class Main {

    public static int[] twoSum(int[] A, int target) {
//        int n = A.length;
//        for(int i=0;i<n;i++) {
//            for(int j=i+1;j<n;j++) {
//                if(A[i]+A[j]==target) {
//                    return new int[]{i+1,j+1};
//                }
//            }
//        }
//
//        return new int[]{-1,-1};

        int left = 0;
        int right = A.length-1;

        while(left < right) {
            if(A[left]+A[right]==target) {
                return new int[]{left+1,right+1};
            }
            if(A[left]+A[right] < target) {
                left++;
            }
            else right--;
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



