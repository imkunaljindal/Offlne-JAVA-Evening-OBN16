import java.io.*;
import java.util.*;

public class Main {
    static String keypad[] = {".;","abc","def","ghi","jkl","mno","pqrs","tu","vwx","yz"};

    static void helper(String ques, String ans, int i) {
        if(i>=ques.length()) {
            System.out.println(ans);
            return;
        }

        int currIdx = ques.charAt(i) - '0';
        for(int j=0;j<keypad[currIdx].length();j++) {
            helper(ques,ans+keypad[currIdx].charAt(j),i+1);
        }

    }

    static void printKPC(String ques) {
        helper(ques,"",0);
    }

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String str;
        str = sc.nextLine();
        printKPC(str);
    }
}