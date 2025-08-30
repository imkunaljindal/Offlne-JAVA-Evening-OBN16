import java.util.*;

public class Main {
    public static void main(String[] args) {

        // Write your code here
        Scanner sc = new Scanner(System.in);
        int n, k;
        n = sc.nextInt();
        k = sc.nextInt();

        int temp = n;
        int digits = 0;
        while(temp!=0) {
            digits++;
            temp = temp/10;
        }
        k = k%digits; // extra cycles remove
        if(k<0) {
            k = k + digits;
        }

        // rotate krne ka logic

        sc.close();
    }
}