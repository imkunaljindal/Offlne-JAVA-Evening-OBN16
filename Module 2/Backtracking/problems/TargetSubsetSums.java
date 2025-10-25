import java.util.*;

public class Main {
    public static ArrayList<ArrayList<Integer>> findSubsets(int[] arr, int tar) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> subSet = new ArrayList<>();
        helper(arr,0,tar,subSet,ans);
        return ans;
    }

    static void helper(int arr[], int i, int tar, ArrayList<Integer> subSet, ArrayList<ArrayList<Integer>> ans) {

        if(tar==0 && !ans.contains(subSet)) {
            ans.add(new ArrayList<>(subSet));
            return;
        }
        if(i>=arr.length || tar < 0) return;

        // take
        subSet.add(arr[i]);
        helper(arr,i+1,tar-arr[i],subSet,ans);

        // not take
        subSet.remove(subSet.size()-1);  // backtrack
        helper(arr,i+1,tar,subSet,ans);
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, tar;
        n = sc.nextInt();
        tar = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        ArrayList<ArrayList<Integer>> subsets = findSubsets(arr, tar);
        Collections.sort(subsets, new Comparator<ArrayList<Integer>>() {
            public int compare(ArrayList<Integer> o1, ArrayList<Integer> o2) {
                return o1.get(0).compareTo(o2.get(0));
            }
        });
        if (subsets.isEmpty()) {
            System.out.println(-1);
        } else {
            for (int i = 0; i < subsets.size(); i++) {
                for (int j = 0; j < subsets.get(i).size(); j++)
                    System.out.print(subsets.get(i).get(j) + " ");
                System.out.println();
            }
        }
        sc.close();
    }
}