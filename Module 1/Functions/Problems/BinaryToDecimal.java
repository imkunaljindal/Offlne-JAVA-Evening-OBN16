import java.util.Scanner;

public class Main {
    public static long binaryToDecimal(long binaryNumber) {
        long ans = 0;
        long mul = 1; // 2^0

        while(binaryNumber > 0) {
            long dig = binaryNumber%10;
            ans = ans + (dig*mul);
            binaryNumber = binaryNumber/10;
            mul = mul*2;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long binaryNumber = scanner.nextInt();
        System.out.println(binaryToDecimal(binaryNumber));
        scanner.close();
    }
}
