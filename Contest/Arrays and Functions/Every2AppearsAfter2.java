import java.util.*;

class Solution {
    public boolean next2(int n, int[] arr) {
        int count = 0; // no of times 2 occurs consecutively

        int i = 0;
        while(i<n) {
            boolean isTwo = false;
            while(i<n && arr[i]==2) {
                isTwo = true;
                i++;
            }
            i++;
            if(isTwo) count++;
            if(count > 1) return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scn.nextInt();
        }
        Solution Obj = new Solution();
        scn.close();
        System.out.print(Obj.next2(n, arr));
    }
}