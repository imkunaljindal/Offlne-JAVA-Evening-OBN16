import java.io.*;
import java.util.*;
public class Main {

    public static String solution(String str) {

        StringBuilder ans = new StringBuilder();
        ans.append(str.charAt(0));
        for(int i=1;i<str.length();i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i-1);
            int diff = curr - prev;
            ans.append(diff);
            ans.append(curr);
        }

        return ans.toString();
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String str = scn.next();
        System.out.println(solution(str));
    }
}