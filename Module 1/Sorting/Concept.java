import java.util.*;

public class Main {
    static int maximum_occurrence(int arr[], int n) {

        Arrays.sort(arr);
        int currFreq = 1;
        int maxFreq = 0;
        int ans = arr[0];

        for(int i=0;i<n-1;i++) {
            if(arr[i]==arr[i+1]) {
                currFreq++;
            }
            else {
                if(currFreq > maxFreq) {
                    maxFreq = currFreq;
                    ans = arr[i];
                }
                currFreq = 1;
            }
        }
        return ans;
    }
    public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print(maximum_occurrence(arr, n));

    }
}
