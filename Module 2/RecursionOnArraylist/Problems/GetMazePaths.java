import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int m = input.nextInt();
        ArrayList<String> paths = getMazePaths(0, 0, n - 1, m - 1);
        System.out.println(paths);
    }

    static void helper(int sr,
                       int sc,
                       int dr,
                       int dc,
                       String path,
                       ArrayList<String> ans) {

        if(sr==dr && sc==dc) {
            ans.add(path);
            return;
        }

        if(sr > dr || sc > dc) return;

        // horizontal
        helper(sr,sc+1,dr,dc,path+'h',ans);
        //vertical
        helper(sr+1,sc,dr,dc,path+'v',ans);
    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
        ArrayList<String> ans = new ArrayList<>();
        helper(sr,sc,dr,dc,"",ans);
        return ans;
    }
}


                        
                        
                        
                        
                        
                                

                        
                                