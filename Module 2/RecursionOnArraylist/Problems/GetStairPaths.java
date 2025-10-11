import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        ArrayList<String> paths = getStairPaths(n);
        System.out.println(paths);
    }

    static void helper(int n, String path, ArrayList<String> ans) {
        if(n==0) {
            ans.add(path);
            return;
        }
        if(n<0) {
            return;
        }

        helper(n-1,path+'1',ans);
        helper(n-2,path+'2',ans);
        helper(n-3,path+'3',ans);
    }
    public static ArrayList<String> getStairPaths(int n) {
        ArrayList<String> ans = new ArrayList<>();
        helper(n,"",ans);
        return ans;
    }
}


                        
                                