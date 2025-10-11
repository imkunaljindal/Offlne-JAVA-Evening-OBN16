import java.io.*;
import java.util.*;

public class Main {

    static void helper(String str, int i, String subSeq, ArrayList<String> ans) {
        if(i >= str.length()) {
            if(subSeq!="") {
            ans.add(subSeq);
            }
            return;
        }

        // take
        helper(str,i+1,subSeq+str.charAt(i),ans);
        // Not take
        helper(str,i+1,subSeq,ans);
    }

    public static ArrayList<String> generateSubsequences(String str)
    {
        ArrayList<String> ans = new ArrayList<>();
        helper(str,0,"",ans);
        Collections.sort(ans);
        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s;
        s = sc.nextLine();
        ArrayList<String> res = generateSubsequences(s);
        for(int i=0;i<res.size();i++){
            System.out.println(res.get(i));
        }
    }
}