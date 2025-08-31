package Patterns.Problems;

import java.util.Scanner;

public class DiamondPattern {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

      for(int k=0;k<t;k++) {
          int n = sc.nextInt();

          //     *
          //   * * *
          // * * * * *
          //   * * *
          //     *

          int upperRows = n/2 + 1;
          int lowerRows = n - upperRows;

          // upper triangle
          int cnt = 1;
          for(int i=1;i<=upperRows;i++) {
              for(int j=1;j<=upperRows-i;j++) {
                  System.out.print("  ");
              }
              for(int j=1;j<=cnt;j++) {
                  System.out.print("* ");
              }
              cnt = cnt + 2;
              System.out.println();
          }

          // lower triangle
          cnt = cnt-4;
          for(int i=1;i<=lowerRows;i++) {
              for(int j=1;j<=i;j++) {
                  System.out.print("  ");
              }
              for(int j=1;j<=cnt;j++) {
                  System.out.print("* ");
              }
              System.out.println();
              cnt = cnt-2;
          }
      }

    }
}
