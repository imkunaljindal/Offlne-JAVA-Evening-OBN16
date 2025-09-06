package Problems;

import java.util.*;

public class Buildings {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        sc.close();
        buildings(arr, n);
    }

    public static void buildings(int[] arr, int n) {

        int maxHeight = arr[0];
        for(int i=1;i<n;i++) {
            if(arr[i] > maxHeight) {
                maxHeight = arr[i];
            }
        }

        for(int i=maxHeight;i>0;i--) {
            // iterate over each building and check if it will give a * at this row
            for(int j=0;j<n;j++) {
                if(arr[j]>=i) {
                    System.out.print("*\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}