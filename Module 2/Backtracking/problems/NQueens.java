import java.util.*;

public class Main {

    static boolean isSafe(int board[][], int r, int c, int n) {

        // column
        for(int i=r-1;i>=0;i--) {
            if(board[i][c]==1) return false;
        }

        // left diagonal
        int x = r-1;
        int y = c-1;
        while(x>=0 && y>=0) {
            if(board[x][y]==1) return false;
            x--;
            y--;
        }

        // right diagonal
        x = r-1;
        y = c+1;

        while(x>=0 && y<n) {
            if(board[x][y]==1) return false;
            x--;
            y++;
        }

        return true;
    }

    static int placeQueens(int board[][], int r, int n) {
        // base case
        if(r==n) {
//            for(int i=0;i<n;i++) {
//                for(int j=0;j<n;j++) {
//                    if(board[i][j]==0) System.out.print('x');
//                    else System.out.print('Q');
//                }
//                System.out.println();
//            }
//            System.out.println();
            return 1;
        }

        int count = 0;
        for(int c=0;c<n;c++) {
            if(isSafe(board,r,c,n)) {
                board[r][c] = 1;
                count += placeQueens(board,r+1,n);
                board[r][c] = 0; // backtrack
            }
        }

        return count;
    }

    public static int totalNQueens(int n) {
        int board[][] = new int[n][n];
        return placeQueens(board,0,n);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(totalNQueens(n));
    }
}