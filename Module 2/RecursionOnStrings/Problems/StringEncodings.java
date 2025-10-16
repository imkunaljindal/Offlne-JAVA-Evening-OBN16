import java.util.*;

public class Main {

    static void helper(String str, String ans, int i) {
        if(i>=str.length()) {
            System.out.println(ans);
            return;
        }

        if(str.charAt(i)=='0') return;

        // single digit
        char c = str.charAt(i); // '2'
        char x = (char)(c-'1' + 'a');
        helper(str,ans+x,i+1);

        // double digit -> [1-26]
        if(i+1<str.length()) {
            int num = Integer.parseInt(str.substring(i,i+2)); // 2 length substring
            if(num<=26) {
                char t = (char)('a' + num-1);
                helper(str,ans+t,i+2);
            }
        }
    }

    public static void printEncodings(String str) {
        helper(str,"",0);

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        printEncodings(str);
    }
}