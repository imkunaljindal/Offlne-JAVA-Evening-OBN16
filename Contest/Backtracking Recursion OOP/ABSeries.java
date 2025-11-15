import java.util.*;
import java.io.*;

class Solution {
    public static int series(int n){
        if (n ==1 ){
            return 0;
        }
        if(n==2){
            return 1 ;
        }
        return (series(n-2)*series(n-2) -series(n-1));
    }
}


public class Main {
    public static void main(String[] args) throws Throwable {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            System.out.print(Solution.series(n));
        }

    }
}