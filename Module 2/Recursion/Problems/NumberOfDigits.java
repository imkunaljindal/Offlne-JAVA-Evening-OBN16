import java.util.*;

public class Main {
    static int numOfDigi(int n) {
        if(n==0) return 0;
        return 1 + numOfDigi(n/10);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        int result = numOfDigi(n);
        System.out.println(result);
        sc.close();
    }
}