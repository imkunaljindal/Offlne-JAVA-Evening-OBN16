import java.io.*;
import java.util.*;

public class SortedInsertPosition {

    public static int searchInsert(int[] a, int b) {
        int n = a.length;
        int s = 0;
        int e = n-1;

        // O(logN)
        while(s<=e) {
            int mid = (s+e)/2;
            if(a[mid]==b) return mid;
            if(a[mid] > b) e = mid-1;
            else s = mid+1;
        }

        return s;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        for(int i=0;i<N;i++){
            A[i] = sc.nextInt();
        }
        int B = sc.nextInt();
        System.out.println(searchInsert(A,B));
    }
}