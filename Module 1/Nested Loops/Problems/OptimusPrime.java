package Problems;

import java.util.Scanner;

public class OptimusPrime {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int x = 1; x <= n; x++) {
            boolean isPrime = true;
            for (int i = 2; i * i <= x; i++) {
                if (x % i == 0) {
                    isPrime = false;
                }
            }
            if (isPrime == true) System.out.println(x);
        }
    }
}
