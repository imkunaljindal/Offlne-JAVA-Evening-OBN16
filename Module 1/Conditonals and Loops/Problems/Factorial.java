import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        input.close();
        // Write your code here

        long fact = 1L;
        for(int i=1;i<=n;i++) {
            fact = fact*i;
        }

        System.out.println(fact);
    }
}