import java.io.*;
import java.util.*;

public class Main{
    static int count = 0;

    static void helper(int i, int j, int n, int m) {
        
    }

    static int countMazePath(int n, int m)
    {
        helper(1,1,n,m);
        return count;
    }
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int m, n;
        n = sc.nextInt();
        m = sc.nextInt();
        System.out.println(countMazePath(n, m));
    }
}