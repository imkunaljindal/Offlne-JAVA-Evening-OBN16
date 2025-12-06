import java.util.*;

class Solution{
    public static int longestSubarray(int[] arr){
        // <diff key, position of diff>
        HashMap<String, Integer> mp = new HashMap<>();
        int zeros = 0;
        int ones = 0;
        int twos = 0;

        int maxLength = 0;

        mp.put("0#0",-1);
        for(int i=0;i<arr.length;i++) {
            if(arr[i]==0) zeros++;
            else if(arr[i]==1) ones++;
            else twos++;

            String key = (ones-zeros) + "#" + (twos-ones);
            if(!mp.containsKey(key)) {
                mp.put(key,i);
            }
            else {
                maxLength = Math.max(maxLength,i-mp.get(key));
            }
        }

        return maxLength;
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
        Solution Obj =  new Solution();
        System.out.println(Obj.longestSubarray(arr));
    }
}
