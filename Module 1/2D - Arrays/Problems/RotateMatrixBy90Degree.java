import java.io.*;
import java.util.*;

class Solution {
    public int[][] rotateBy90(int [][]mat) {
        int n = mat.length;
        int m = mat[0].length;

        //Step 1 - Transpose
        for(int i=0;i<n;i++) {
            for(int j=i;j<n;j++) {
                int temp = mat[i][j];
                mat[i][j] = mat[j][i];
                mat[j][i] = temp;
            }
        }

        // Step 2 - Reverse every row
        for(int i=0;i<n;i++) {
            int start = 0;
            int end = n-1;
            while(start<=end) {
                int temp = mat[i][start];
                mat[i][start] = mat[i][end];
                mat[i][end] = temp;
                start++;
                end--;
            }
        }
        return mat;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, m;
        n = sc.nextInt();
        m = sc.nextInt();
        int [][]mat=new int[n][m];
        for(int i=0;i<n;++i){
            for(int j=0;j<m;++j){
                mat[i][j]=sc.nextInt();
            }
        }
        Solution Obj = new Solution();
        int[][] ans = Obj.rotateBy90(mat);
        for(int i=0; i<n; i++)
        {   for(int j=0; j<n; j++)
        {
            System.out.print(ans[i][j] + " ");
        } System.out.println("");
        }
        System.out.println('\n');
    }
}