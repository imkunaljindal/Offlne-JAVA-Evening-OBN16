package Problems;

import java.util.*;

public class ToggleCharacters {

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        toggleCase(n, str);
    }

    static void toggleCase(int n, String str) {
        for(int i=0;i<str.length();i++) {
            char c = str.charAt(i);
            if(c>='A' && c<='Z') {
                // small
                System.out.print((char)(c+32));
            }
            else if(c>='a' && c<='z') {
                //capital
                System.out.print((char)(c-32));
            }
            else {
                System.out.print(c);
            }
        }
    }
}