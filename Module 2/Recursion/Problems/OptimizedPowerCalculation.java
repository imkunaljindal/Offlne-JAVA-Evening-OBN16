import java.io.*;
import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int X,N;
        X = sc.nextInt();
        N = sc.nextInt();

        System.out.println(power(X,N));
    }

    public static long power(int x, int y)
    {
        if(y==0) return 1;
        long small = power(x,y/2);
        small = small*small;
        if(y%2==1) small = small*x;

        return small;
    }
}
