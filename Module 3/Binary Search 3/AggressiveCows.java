import java.io.*;
import java.util.*;
import java.util.*;

class Solution{

    static boolean canPlaceCows(int a[], int minDist, int cows) {
        int lastPlaceCow = a[0];
        int cowsPlaced = 1;

        for(int i=1;i<a.length;i++) {
            if(a[i]-lastPlaceCow >= minDist) {
                cowsPlaced++;
                lastPlaceCow = a[i];
            }
        }

        return cowsPlaced >= cows;
    }

    public static int aggressiveCows(int a[],int cows){

        int n = a.length;
        Arrays.sort(a);

        int s = 0;
        int e = a[n-1]-a[0];

        int ans = -1;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(canPlaceCows(a,mid,cows)) {
                ans = mid;
                s = mid+1;
            }
            else e = mid-1;
        }
        return ans;
    }


}

class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution obj=new Solution();
        System.out.println(obj.aggressiveCows(nums,k));

    }
}
