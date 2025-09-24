package Problems;

import java.util.*;
import java.io.*;

public class Pangrams {
    public  static void isPangram(String s)
    {
        boolean isPresent[] = new boolean[26];

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            if(c>='A' && c<='Z') {
                isPresent[c-65] = true;
            }
            else if(c>='a' && c<='z') {
                isPresent[c-97] = true;
            }
        }

        for(int i=0;i<26;i++) {
            if(isPresent[i]==false) {
                System.out.println("not pangram");
                return;
            }
        }
        System.out.println("pangram");
    }
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        isPangram(s);

    }
}