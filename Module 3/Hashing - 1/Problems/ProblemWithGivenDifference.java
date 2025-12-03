import java.io.*;
import java.util.*;

class Solution {
    public int givenDifference(int []A, int n, int B) {
        HashSet<Integer> st = new HashSet<>();

        for(int i=0;i<n;i++) {
            int op1 = A[i]+B;
            int op2 = A[i]-B;

            if(st.contains(op1) || st.contains(op2)) return 1;
            st.add(A[i]);
        }

        return 0;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,B;
        n = sc.nextInt();
        int []mat=new int[n];
        for(int i=0;i<n;++i){
            mat[i]=sc.nextInt();
        }
        B = sc.nextInt();
        Solution Obj = new Solution();
        System.out.println(Obj.givenDifference(mat,n,B));
        System.out.println('\n');
    }
}
