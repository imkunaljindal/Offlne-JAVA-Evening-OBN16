import java.io.*;
import java.util.*;


public class ReverseArray {

    public static void reverseArray(int arr[])
    {
        int start = 0;
        int end = arr.length-1;

        while(start<=end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int arr1[] = new int[n];
        for(int i=0;i<n;i++)
            arr1[i] = sc.nextInt();

        reverseArray(arr1);

        for (int i = 0; i < n; i++)
            System.out.print(arr1[i] + " ");
        System.out.println('\n');
    }
}
