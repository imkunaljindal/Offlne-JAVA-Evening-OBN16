import java.util.*;
class Solution {

    public List<List<Integer>> combinationSum(int[] nums, int target){
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> comb = new ArrayList<>();
        helper(nums,0,target,comb,ans);
        return ans;
    }

    static void helper(int nums[], int i, int target,
                       List<Integer> comb,
                       List<List<Integer>> ans) {

        if(target==0) {
            ans.add(new ArrayList<>(comb));
            return;
        }
        if(i>=nums.length || target < 0) return;

        // take
        comb.add(nums[i]);
        helper(nums,i,target-nums[i],comb,ans);

        // not take
        comb.remove(comb.size()-1);
        helper(nums,i+1,target,comb,ans);
    }
}
public class Main {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int []nums = new int[n];
        for(int i = 0 ; i < n ; ++i){
            nums[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        List<List<Integer>> ans = ob.combinationSum(nums,target);
        for(int i = 0 ; i < ans.size() ; ++i){
            Collections.sort(ans.get(i));
        }
        Collections.sort(ans, (o1, o2) -> {
            int m = Math.min(o1.size(), o2.size());
            for (int i = 0; i < m; i++) {
                if (o1.get(i) == o2.get(i)){
                    continue;
                }else{
                    return o1.get(i) - o2.get(i);
                }
            }
            return 1;
        });
        for (int i = 0; i < ans.size (); i++)
        {
            for (int j = 0; j < ans.get(i).size (); j++)
            {
                System.out.print(ans.get(i).get(j)+" ");
            }
            System.out.println();

        }


    }
}