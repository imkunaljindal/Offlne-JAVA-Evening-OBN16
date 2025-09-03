import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean res = determineSecondLastDigit(n);
        if (res)
            System.out.println("Yes");
        else
            System.out.println("No");
    }

    public static boolean determineSecondLastDigit(int n) {
        // edge cases
        if(n<=9) return false;

        // last digit ko remove krna
        n = n/10;

        // check second last digit
        int dig = n%10;
        if(dig==0) return true;

        return false;
    }
}