import java.io.*;
import java.util.*;

public class Main {
    static String strangeString(int n) {
        StringBuilder sb = new StringBuilder();
        char c = 'a';

        for(int i=0;i<n;i++) {
            if(i%2==0) {
                //front
                sb.insert(0,c);
            }
            else {
                //back
                sb.append(c);
            }
            c++;
            if(c > 'z') c = 'a';
        }
        return sb.toString();
    }

    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int t = input.nextInt();
        while (t-- > 0){
            int n = input.nextInt();
            System.out.println(strangeString(n));
        }
    }
}