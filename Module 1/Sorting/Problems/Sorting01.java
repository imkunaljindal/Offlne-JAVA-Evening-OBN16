import java.util.*;

public class Main {
    static int[] Sorting01(int n,int[] arr){
        int start = 0;
        int end = n-1;

        while(start <= end) {
            while(start < end && arr[start]==0) start++;
            while(start < end && arr[end]==1) end--;
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        return arr;


    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;++i){
            arr[i] = sc.nextInt();
        }
        int[] ans=Sorting01(n,arr);
        for(int i=0;i<n;++i){
            System.out.print(ans[i] + " ");
        }
    }
}