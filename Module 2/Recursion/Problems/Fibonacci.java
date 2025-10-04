import java.util.*;
import static java.lang.Math.ceil;

public class Main {

    public static int fib(int n ){
        if(n==1 || n==2) return n-1;
        return fib(n-1) + fib(n-2);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        System.out.println(fib(n));
    }
}