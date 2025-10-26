
import java.util.*;

class Solution {

    static void helper(int coins[], int amt, String perm) {
        if(amt==0) {
            System.out.println(perm);
            return;
        }
        if(amt<0) return;

        for(int i=0;i<coins.length;i++) {
            helper(coins,amt-coins[i],perm + coins[i] + " ");
        }
    }

    public static void coinChange2(int[] coins, int amt){
        String perm = "";
        helper(coins,amt,perm);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] coins = new int[n];
        for (int i = 0; i < n; i++) {
            coins[i] = sc.nextInt();
        }
        int amt = sc.nextInt();

        Solution Obj = new Solution();
        Obj.coinChange2(coins, amt);
    }
}