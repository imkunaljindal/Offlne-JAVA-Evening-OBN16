package Problems;

import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        sc.close();

        boolean isPrime = true;
        for(int i=2;i*i<=n;i++) {
            if(n%i==0) {
                isPrime = false;
            }
        }

        if(isPrime==false) {
            System.out.println(n + " is not a prime number");
        }
        else {
            System.out.println(n + " is a prime number");
        }
    }
}
