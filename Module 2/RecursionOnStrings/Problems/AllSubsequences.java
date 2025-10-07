package Problems;

import java.util.*;
import java.util.Scanner;

public class AllSubsequences{

    //
    static void helper(String s, int i, String ans) {
        if(i >= s.length()) {
            System.out.println(ans);
            return;
        }

        // Not take
        helper(s,i+1,ans);
        // take
        helper(s,i+1,ans+s.charAt(i));
    }

    static void printSubsequence(String s) {
        helper(s,0,"");
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        printSubsequence(s);
    }
}