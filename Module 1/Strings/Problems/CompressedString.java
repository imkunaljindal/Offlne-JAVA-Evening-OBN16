import java.util.*;
import java.io.*;

public class Main {
    static void compressedString(String s) {
        int n = s.length();
        for(int i=0;i<n;i++) {
            int count = 1;
            while(i<n-1 && s.charAt(i)==s.charAt(i+1)) {
                count++;
                i++;
            }
            System.out.print(s.charAt(i));
            if(count>1) System.out.print(count);
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int t=Integer.parseInt(br.readLine());
        while(t-- > 0){
            String s = br.readLine();
            compressedString(s);
            System.out.println();
        }
    }
}

