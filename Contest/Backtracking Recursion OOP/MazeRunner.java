import java.util.*;

class Solution{
    static ArrayList <String> MazeRunner(int n,int m){
        //write code here
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        Solution obj = new Solution();
        ArrayList <String> ans=obj.MazeRunner(n,m);
        Collections.sort(ans);
        for(String i:ans) System.out.print(i+" ");
    }
}