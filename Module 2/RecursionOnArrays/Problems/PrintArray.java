package Problems;

import java.util.*;


public class PrintArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, n);
    }

    /**
     * Template 2
     * @param arr
     * @param n
     */
    public static void PrintArray(int[] arr, int n) {
        if(n==0) return;

        PrintArray(arr,n-1);
        System.out.println(arr[n-1]);
    }

//    public static void PrintArray(int[] arr, int n) {
//        helper(arr,0);
//    }
//
//
//    public static void helper(int []arr, int i) {
//        if(i>=arr.length) return;
//        System.out.print(arr[i] + " ");
//        helper(arr,i+1);
//    }

}