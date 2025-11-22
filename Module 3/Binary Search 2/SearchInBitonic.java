
import java.io.*;
import java.util.*;
public class Main {
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int arr[]=new int[N];
        for(int i=0;i<N;i++)
            arr[i]=sc.nextInt();

        int target=sc.nextInt();

        Accio ob = new Accio();
        int ans= ob.findElement(arr, N,target);

        System.out.println(ans);

    }
}


class Accio {

    static int findPeakIndex(int arr[], int n) {
        if(arr[0]>arr[1]) return 0;
        if(arr[n-1]>arr[n-2]) return n-1;
        int s = 1;
        int e = n-2;
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            if(arr[mid]>arr[mid+1]) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }

    static int incBinarySearch(int arr[], int s, int e,int target) {

        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target) e = mid-1;
            else s = mid+1;
      }
        return -1;
    }

    static int decBinarySearch(int arr[], int s, int e, int target) {
        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]<target) e = mid-1;
            else s = mid+1;
        }
        return -1;
    }

    static int findElement(int arr[], int n,int target)
    {
        int peakIdx = findPeakIndex(arr,n);

        int idx = incBinarySearch(arr,0,peakIdx,target);
        if(idx!=-1) return idx;

        idx = decBinarySearch(arr,peakIdx+1,n-1,target);
        return idx;


    }
}