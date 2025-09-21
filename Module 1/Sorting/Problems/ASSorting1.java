import java.util.*;

class Solution{

    static int[][] transpose(int[][] a, int n, int m) {
        int b[][] = new int[m][n];

        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                b[j][i] = a[i][j];
            }
        }
        return b;
    }

    public static void sortCol(int[][] mat, int N, int M){
        int [][]b = transpose(mat,N,M);

        //sort every row M x N
        for(int i=0;i<M;i++) {
            Arrays.sort(b[i]);
        }

        // again transpose
        mat = transpose(b,M,N);

        for(int i=0;i<N;i++) {
            for(int j=0;j<M;j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] mat =new int[n][m];
        for(int i=0;i<n;i++) {
            for(int j=0;j<m;j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        Solution.sortCol(mat, n, m);

    }
}