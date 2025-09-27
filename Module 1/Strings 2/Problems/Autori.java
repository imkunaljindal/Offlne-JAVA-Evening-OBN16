package Problems;

import java.io.*;
import java.util.*;

public class Autori {
    static String autori(String str){
       String[] s = str.split("-");

       String ans = "";
       for(int i=0;i<s.length;i++) {
           ans += s[i].charAt(0);
       }

       return ans;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.next();
        String result = autori(str);
        System.out.print(result);
        System.out.println('\n');
    }
}