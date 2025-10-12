
import java.util.*;
import java.io.*;

class Solution1{

    static int partition(int arr[], int s, int e) {

        // swap last element with a random element
        int randomIdx = (int) (Math.random() * (e - s - 1) + s);
        swap(arr,randomIdx,e);

        int pivot = e;
        int left = s-1;

        for(int i=s;i<=e-1;i++) {
            if(arr[i] > arr[pivot]) {
                left++;
                swap(arr,left,i);
            }
        }
        swap(arr,left+1,pivot);
        return left+1;
    }

    static void swap(int arr[], int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    static void quickSortHelper(int arr[], int l, int r) {

        if(l>=r) return;
        int p = partition(arr,l,r);
        quickSortHelper(arr,l,p-1); // left
        quickSortHelper(arr,p+1,r); // right
    }

    static void quickSort(int[] arr){
        quickSortHelper(arr,0,arr.length-1);
    }
}

public class QuickSort {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        Solution1 Obj = new Solution1();
        Obj.quickSort(arr);
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
        System.out.println();
        sc.close();
    }
}