
import java.util.*;

class Solution {

    static void helper(int coins[], String perm, int amt, boolean used[]) {

        if(amt==0) {
            System.out.println(perm);
            return;
        }
        if(amt<0) return;

        for(int i=0;i<coins.length;i++) {
            if(used[i]==false) {
                used[i] = true;
               helper(coins,perm+coins[i]+" ",amt-coins[i],used);
               used[i] = false; //backtrack
            }
        }
    }

    public static void coinChange(int[] coins, int amt){
        String perm = "";
        boolean used[] = new boolean[coins.length];
        helper(coins,perm,amt,used);
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
        Obj.coinChange(coins, amt);
    }
}