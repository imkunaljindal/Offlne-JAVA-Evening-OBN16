package Problems;

import java.util.Scanner;

public class ConditonalProblem6 {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        if(a%2==1 && b%2==1) {
            System.out.println("we are odd");
        }
        else {
            System.out.println("we are simple");
        }
    }
}
