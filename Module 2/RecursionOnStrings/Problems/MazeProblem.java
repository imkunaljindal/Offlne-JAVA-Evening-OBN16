import java.io.*;
import java.util.*;

public class Main {
    public static void printMazePaths(int sr, int sc, int dr, int dc, String psf) {
        if(sr==dr && sc==dc) {
            System.out.println(psf);
            return;
        }
        // grid ke bahar
        if(sr > dr || sc > dc) return;

        // horizontal
        for(int step=1; step<=dc;step++) {
            printMazePaths(sr,sc+step,dr,dc,psf+'h'+step);
        }
        // vertical
        for(int step=1;step<=dr;step++) {
            printMazePaths(sr+step,sc,dr,dc,psf+'v'+step);
        }
        // diagonal
        for(int step=1; step<=Math.max(dr,dc);step++) {
            printMazePaths(sr+step,sc+step,dr,dc,psf+'d'+step);
        }
    }
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());
        printMazePaths(0, 0, n - 1, m - 1, "");
    }
}