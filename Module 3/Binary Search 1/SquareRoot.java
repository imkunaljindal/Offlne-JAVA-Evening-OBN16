import java.util.*;
import java.lang.*;
import java.io.*;

class SquareRoot {
    public static void sqrt(int A) {
        long s = 0;
        long e = A;
        long ans = -1;

        while(s<=e) {
            long mid = s + (e-s)/2;
            if(mid*mid <= A) {
                ans = mid;
                s = mid+1;
            }
            else e = mid-1;
        }
        System.out.println(ans);
    }

    public static void main (String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();

        sqrt(A);

    }
}