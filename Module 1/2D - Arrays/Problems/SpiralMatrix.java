import java.util.*;

class Accio {
    static int[] SpiralMatrix(int n, int[][] matrix) {
        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;

        int ans[] = new int[n * n];
        int k = 0;

        while (top<=bottom && left<=right) {
            // Red
            for (int j = left; j <= right; j++) {
                ans[k++] = matrix[top][j];
            }
            top++;

            // Blue
            for (int i = top; i <= bottom; i++) {
                ans[k++] = matrix[i][right];
            }
            right--;

            // Yellow
            if (top <= bottom) {
                for (int j = right; j >= left; j--) {
                    ans[k++] = matrix[bottom][j];
                }
            bottom--;
            }

            //Green
            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    ans[k++] = matrix[i][left];
                }
                left++;
            }

        }
    }
}

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int matrix[][] = new int[n][n];
        for (int i = 0; i < n; ++i) {
            for (int j = 0; j < n; ++j) {
                matrix[i][j] = sc.nextInt();
            }
        }
        Accio obj = new Accio();
        int[] ans = obj.SpiralMatrix(n, matrix);
        for (int i = 0; i < n * n; ++i) {
            System.out.print(ans[i] + " ");
        }
    }
}