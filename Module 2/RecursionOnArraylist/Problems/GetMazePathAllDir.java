import java.io.*;
import java.util.*;

public class Main {

    static void helper(int i, int j, int n, int m, String path,
                       ArrayList<String> ans) {

        if(i==n && j==m) {
            ans.add(path);
            return;
        }

        if(i>n || j>m) return;

        //h1
        helper(i,j+1,n,m,path+"h1",ans);
        helper(i,j+2,n,m,path+"h2",ans);

        // vertical
        helper(i+1,j,n,m,path+"v1",ans);
        helper(i+2,j,n,m,path+"v2",ans);

        //diagonal
        helper(i+1,j+1,n,m,path+"d1",ans);
        helper(i+2,j+2,n,m,path+"d2",ans);
    }

    public static ArrayList<String> allPossiblePaths(int n, int m) {
        ArrayList<String> ans = new ArrayList<>();
        helper(1,1,n,m,"",ans);
        return ans;
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> result = allPossiblePaths(n, m);
        Collections.sort(result);
        for (String str : result) {
            System.out.println(str);
        }

    }
}
