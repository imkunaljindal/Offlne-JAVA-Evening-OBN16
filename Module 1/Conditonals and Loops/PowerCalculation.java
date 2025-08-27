import java.util.Scanner;

public class PowerCalculation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int product = 1;
        for(int i=1;i<=b;i++) {
            product = product*a;
        }

        System.out.println(product);
    }
}
