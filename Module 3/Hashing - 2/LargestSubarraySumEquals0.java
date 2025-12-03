import java.util.HashMap;
import java.io.*;
import java.util.*;

class Solution {
    public int maxLen(int arr[])
    {
        int prefixSum = 0;
        int maxLen = -1;

        // <prefixSum,Index at which pSum occured>
        HashMap<Integer,Integer> mp = new HashMap<>();
        mp.put(0,-1); // to consider 0 prefixSum case
        for(int i=0;i<arr.length;i++) {
            prefixSum += arr[i];
            if(!mp.containsKey(prefixSum)) {
                mp.put(prefixSum,i);
            }
            else {
                int len = i - mp.get(prefixSum);
                maxLen = Math.max(maxLen,len);
            }
        }

        return maxLen;
    }
}

class Main {

    public static void main(String arg[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        Solution Obj = new Solution();
        System.out.println(Obj.maxLen(nums));
    }
}
