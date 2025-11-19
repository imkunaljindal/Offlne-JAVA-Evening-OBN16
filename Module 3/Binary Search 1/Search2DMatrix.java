import java.util.*;

public class Main {
    public static boolean SearchA2DMatrix(int[][] mat, int x) {
        int m = mat.length;
        int n = mat[0].length;
        int s = 0;
        int e = m*n-1;

        // O(log(M*N) -> O(log(M) + log(N))
        while(s<=e) {
            int mid = (s+e)/2;
            int ele = mat[mid/m][mid%m];
            if(ele==x) return true;
            if(ele > x) e = mid-1;
            else s = mid+1;
        }
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int[][] mat = new int[m][n];
        for(int i = 0; i< m; i++) {
            for(int j = 0; j<n; j++)
                mat[i][j] = sc.nextInt();
        }
        int x = sc.nextInt();
        if(SearchA2DMatrix(mat, x))
            System.out.println("true");
        else
            System.out.println("false");
    }
}