package Problems;

import java.util.*;


public class SecondLargest {
    public static void SecondLargest(int[] arr, int n) {
        int maxElementIdx = 0; // -2^31
        for(int i=0;i<n;i++) {
            if(arr[i] > arr[maxElementIdx]) {
                maxElementIdx = i;
            }
        }

        int secondMax = Integer.MIN_VALUE;
        for(int i=0;i<n;i++) {
            // gives unique second max
            if(arr[i] > secondMax && i!=maxElementIdx) {
                secondMax = arr[i];
            }
        }

        System.out.println(secondMax);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n= sc.nextInt();
        int[] arr= new int[n];

        for(int i=0;i<n;i++)
            arr[i]=sc.nextInt();

        SecondLargest(arr,n);
        sc.close();

    }
}