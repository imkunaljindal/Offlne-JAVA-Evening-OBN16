package Problems;

import java.io.*;
import java.util.*;

class PrintAcciojob
{
    public static void main(String args[])throws IOException
    {
        Scanner sc = new Scanner(System.in);

        int n=sc.nextInt();

        solve(n);

    }

    public static void solve(int n)
    {
        //if(n==0) return;
        if(n==1) {
            System.out.println("ACCIOJOB");
            return;
        }
        System.out.println("ACCIOJOB");
        solve(n-1);
    }
}