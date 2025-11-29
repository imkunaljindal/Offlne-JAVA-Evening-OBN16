import java.util.*;

class Solution {
    static void missingNumbers(int n, int arr[], int m, int brr[]) {
        HashMap<Integer,Integer> freqArr = new HashMap<>();
        HashMap<Integer,Integer> freqBrr = new HashMap<>();

        // map 1
        for(int i=0;i<n;i++) {
            int currFreq = freqArr.getOrDefault(arr[i],0);
            freqArr.put(arr[i],currFreq+1);
        }

        // map 2
        for(int i=0;i<m;i++) {
            int currFreq = freqBrr.getOrDefault(brr[i],0);
            freqBrr.put(brr[i],currFreq+1);
        }

        List<Integer> ans = new ArrayList<>();
        for(int key: freqBrr.keySet()) {
            if(!freqArr.containsKey(key)) {
                ans.add(key);
            }
            else if(freqArr.get(key)!=freqBrr.get(key)) {
                ans.add(key);
            }
        }

        Collections.sort(ans);
        for(int i=0;i<ans.size();i++) {
            System.out.print(ans.get(i) + " ");
        }

        if(ans.size()==0) {
            System.out.println(-1);
        }
    }

}

public class MissingNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i]= sc.nextInt();
        }

        int m = sc.nextInt();
        int brr[] = new int[m];
        for(int i=0; i<m; i++){
            brr[i]= sc.nextInt();
        }

        Solution Obj = new Solution();
        Obj.missingNumbers(n,arr,m,brr);
    }
}