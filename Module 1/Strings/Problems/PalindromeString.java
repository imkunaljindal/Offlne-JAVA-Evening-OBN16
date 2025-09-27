import java.io.*;
import java.util.*;

public class Main {
    static int isPalindrome(String str)
    {
        int n = str.length();
        int i = 0;
        int j = n-1;
        str = str.toLowerCase();

        System.out.println(str);

        while(i<j) {
            if(!(str.charAt(i) >= 'a' && str.charAt(i) <= 'z')) {
                i++;
                continue;
            }
            if(!(str.charAt(j) >= 'a' && str.charAt(j) <= 'z')) {
                j--;
                continue;
            }
            if(str.charAt(i)!=str.charAt(j)) {
                return 0;
            }
            i++;
            j--;
        }

        return 1;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str=sc.nextLine();
        int result = isPalindrome(str);
        System.out.println(result);
    }
}