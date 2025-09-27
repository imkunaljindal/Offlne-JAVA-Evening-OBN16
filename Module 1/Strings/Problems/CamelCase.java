import java.util.*;

class Main {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            String s = sc.next();
            camelCase(s);
            System.out.println();

        }
    }

    static void camelCase(String s) {
        int i = 0;
        int n = s.length();

        while(i<n) {
            if(s.charAt(i)=='_') {
                System.out.print((char)(s.charAt(i+1) - 32));
                i+=2;
            }
            else {
                System.out.print(s.charAt(i));
                i++;
            }
        }
    }
}