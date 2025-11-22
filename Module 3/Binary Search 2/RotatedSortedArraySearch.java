import java.util.*;
import java.lang.*;
import java.io.*;

class Main {
    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        Solution ob = new Solution();
        System.out.println(ob.search(A,B));

    }
}

class Solution{
    public int search(final int[] a, int target) {
        int n = a.length;
        int s = 0;
        int e = n-1;

        while(s<=e) {
            int mid = s + (e-s)/2;
            if(a[mid]==target) return mid;
            if(a[mid] > a[0]) {
                // first half
                if(a[0] <= target && a[mid]>target) e = mid-1;
                else s = mid+1;
            }
            else {
                // second half
                if(a[mid]<target && target<=a[n-1]) s = mid+1;
                else e = mid-1;
            }
        }

        return -1;
    }
}