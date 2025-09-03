import java.util.Scanner;

public class Main {
    public static void fun(int n, int m) {
        System.out.println(n+m);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();

        fun(n, m);
    }
}