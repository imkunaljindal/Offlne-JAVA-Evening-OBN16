import java.io.*;
import java.util.*;

public class Main {

    static ArrayList<Integer> arrayGenerator(String s){
        ArrayList<Integer> ans = new ArrayList<>();
        String[] strs = s.split(",");

        for(int i=0;i<strs.length;i++) {
            ans.add(Integer.parseInt(strs[i]));
        }

        return ans;
    }

    static ArrayList<String> fun(ArrayList<Integer> nums) {
        // input -> [10,20,30]
        // output -> ["10","20","30"]

        ArrayList<String> ans = new ArrayList<>();
//        for(int i=0;i<nums.size();i++) {
//            ans.add(String.valueOf(nums.get(i)));
//        }

        for(int x: nums) {
            ans.add(String.valueOf(x));
        }


    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        input.nextLine();
        while (t-- > 0) {
            String s = input.nextLine();
            ArrayList<Integer> ans = arrayGenerator(s);
            System.out.print("[");
            for (int i = 0; i < ans.size(); i++) {
                System.out.print(ans.get(i));
                if (i != ans.size() - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

    }
}
