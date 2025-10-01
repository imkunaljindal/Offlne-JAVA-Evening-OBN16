package Problems;

import java.util.*;
public class PrintInReverse {

    public static void printtillN(int N) {
        if(N==0) return;
        System.out.println(N);
        printtillN(N-1);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N;
        N = sc.nextInt();
        printtillN(N);
        sc.close();
    }
}