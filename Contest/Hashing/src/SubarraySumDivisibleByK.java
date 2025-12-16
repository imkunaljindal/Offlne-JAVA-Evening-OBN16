import java.io.*;
import java.util.*;

public class Main {

    public static int subarrayDivisbleByK(int arr[], int n, int k){
        int res = 0;
        Map<Integer, Integer> prefCnt = new HashMap<>();
        int sum = 0;

        for (int i = 0; i < n; i++) {

            // prefix sum mod k (handling negative prefix sum)
            sum = ((sum + arr[i]) % k + k) % k;

            // If sum == 0, then increment the result by 1
            // to count subarray arr[0...i]
            if (sum == 0)
                res += 1;
            
            res += prefCnt.getOrDefault(sum, 0);

            prefCnt.put(sum, prefCnt.getOrDefault(sum, 0) + 1);
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int k=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;++i){
            arr[i]=sc.nextInt();
        }
        int result = subarrayDivisbleByK(arr, n, k);
        System.out.print(result);
        System.out.println('\n');
    }
}