package Problems;

import java.util.Scanner;

public class ReverseDigits {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        while(n>0) {
            System.out.print(n%10);
            n = n/10;
        }

//        int count = 0;
//
//        while(n>0) {
//            count++;
//            n = n/10;
//        }

//        int revNum = 0;
//
//        while(n>0) {
//            revNum = revNum*10 + n%10;
//            n = n/10;
//        }
//
//        System.out.println(revNum);

        int digits = 0;

        while(n>0) {
            digits++;
            n = n/10;
        }
    }
}
