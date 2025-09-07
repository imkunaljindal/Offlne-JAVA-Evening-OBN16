import java.util.*;

public class Main {
    static int[] calSum(int a[], int b[], int n, int m) {
        int sz = Math.max(n,m);
        int ans[] = new int[sz];

        int i = n-1;
        int j = m-1;
        int k = sz-1; // to move on the answer array

        int carry = 0;

        while(i>=0 || j>=0) {
            int sum = 0;
            if(i>=0) {
                sum += a[i];
            }
            if(j>=0) {
                sum += b[j];
            }
            sum += carry;

            int currDig = sum%10;
            carry = sum/10;

            ans[k] = currDig;
            i--;
            j--;
            k--;
        }

        if(carry > 0) {
            int newAns[] = new int[sz+1];
            newAns[0] = carry;
            for(int x=0;x<sz;x++) {
                newAns[x+1] = ans[x];
            }
            return newAns;
        }
        return ans;



    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = calSum(arr1, arr2, n1, n2);
        for (int i : res) System.out.println(i);
    }
}