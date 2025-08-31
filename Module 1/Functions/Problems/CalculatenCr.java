package Problems;

import java.util.*;

public class CalculatenCr {

    static long fact(int n) {
        long ans = 1;
        for(int i=1;i<=n;i++) {
            ans = ans*i;
        }

        return ans;
    }

    static long calculate_nCr(int n, int r) {
        long n_fact = fact(n);
        long r_fact = fact(r);
        long n_r_fact = fact(n-r);

        return (n_fact/(r_fact*n_r_fact));
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int r = scanner.nextInt();
        long ans = calculate_nCr(n,r);
        System.out.print(ans);
    }
}