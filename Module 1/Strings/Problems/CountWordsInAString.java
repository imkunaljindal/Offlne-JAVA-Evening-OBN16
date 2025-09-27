import java.io.*;
import java.lang.*;
import java.util.*;

class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        String p = sc.nextLine();
        while (t > 0) {
            String s = sc.nextLine();
            System.out.println(countWords(s));
            t--;
        }
    }

    public static int countWords(String s) {
        // your code here
        int count = 0;
        char prev = ' ';

        for(int i=0;i<s.length();i++) {
            if(s.charAt(i)==' ' && prev != ' ') {
                count++;
            }
            else if(i==s.length()-1 && s.charAt(i)!=' ') {
                count++;
            }
            prev = s.charAt(i);
        }

        return count;
    }
}