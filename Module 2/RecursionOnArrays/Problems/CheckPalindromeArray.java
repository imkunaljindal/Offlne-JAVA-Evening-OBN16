import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        sc.close();

        System.out.println(isPalindrome(arr, n));
    }

    public static boolean isPalindrome(int[] arr, int n) {
        return helper(arr,0,n-1);
    }

    public static boolean helper(int arr[], int left, int right) {
        if(left >= right) return true;

        if(arr[left]!=arr[right]) return false;
        return helper(arr,left+1,right-1);
    }

}