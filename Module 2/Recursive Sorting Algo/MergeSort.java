import java.util.*;

class Solution {

    public static void merge(int arr[], int l, int mid, int r) {
        ArrayList<Integer> mergedArr = new ArrayList<>();
        int i = l;
        int j = mid+1;

        while(i<=mid && j<=r) {
            if(arr[i] <= arr[j]) {
                mergedArr.add(arr[i++]);
            }
            else {
                mergedArr.add(arr[j++]);
            }
        }

        while(i<=mid) mergedArr.add(arr[i++]);
        while(j<=r) mergedArr.add(arr[j++]);

        // copy values to original array
        for(int k=l;k<=r;k++) {
            arr[k] = mergedArr.get(k-l);
        }
    }

    public static void mergesort(int arr[], int l, int r) {
        if(l>=r) return;

        int mid = (l+r)/2;
        mergesort(arr,l,mid); // left
        mergesort(arr,mid+1,r); // right
        merge(arr,l,mid,r);
    }
}

public class MergeSort {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        Obj.mergesort(arr, 0, n - 1);
        for (int i = 0; i < n; i++) System.out.print(arr[i] + " ");
    }


}