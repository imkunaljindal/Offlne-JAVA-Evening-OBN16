package Patterns.Problems;

import java.util.Scanner;

public class ContinuousCharacterPattern {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        sc.close();

        //A
        //BC
        //CDE
        //DEFG
        //EFGHI

        for(int i=1;i<=n;i++) {
            char c = (char)(64+i);
            for(int j=0;j<i;j++) {
                System.out.print(c);
                c++;
                if(c>'Z') c = 'A';
            }
            System.out.println();
        }

        for(int i=0;i<n;i++) {
            for(int j=0;j<=i;j++) {
                System.out.print((char)(65+(i+j)%26));
            }
            System.out.println();
        }
}
}
