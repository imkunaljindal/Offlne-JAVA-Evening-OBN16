import java.io.*;
import java.util.*;

class Solution {
    public int[] getLeftMax(int arr[], int n) {
        int ans[] = new int[n];
        ans[0] = arr[0];
        for(int i=1;i<n;i++) {
            ans[i] = Math.max(ans[i-1],arr[i]);
        }
        return ans;
    }

    public int[] getRightMax(int arr[], int n) {
        int ans[] = new int[n];
        ans[n-1] = arr[n-1];
        for(int i=n-2;i>=0;i--) {
            ans[i] = Math.max(ans[i+1],arr[i]);
        }
        return ans;
    }

    public void TappingWater(int[] arr, int n) {
        int leftMax[] = getLeftMax(arr, n);
        int rightMax[] = getRightMax(arr,n);

        int totalWater = 0;
        for(int i=0;i<n;i++) {
            int water = Math.min(leftMax[i],rightMax[i])-arr[i];
            if(water>0) totalWater += water;
        }

        System.out.println(totalWater);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();


        Solution Obj = new Solution();
        Obj.TappingWater(arr, n);


        sc.close();

    }
}