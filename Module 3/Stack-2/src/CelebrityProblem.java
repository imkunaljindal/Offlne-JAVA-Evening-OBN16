import java.io.*;
import java.util.*;

class Main{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M[][] = new int[N][N];
        for(int i=0; i<N; i++)
            for(int j=0; j<N; j++)
                M[i][j] = sc.nextInt();
        System.out.println(new Solution().findCelebrity(M,N));
    }
}
class Solution
{
    int findCelebrity(int M[][], int n)
    {
        Stack<Integer> st = new Stack<>();
        for(int i=0;i<n;i++) {
            st.push(i);
        }

        while(st.size()!=1) {
            int p1 = st.pop();
            int p2 = st.pop();

            if(M[p1][p2]==1) {
                // p1 p2 ko jaanta hai
                st.push(p2);
            }
            else st.push(p1);
        }

        int potentialCeleb = st.pop();

        // row - celeb doesn't know anyone
        for(int i=0;i<n;i++) {
            if(M[potentialCeleb][i]==1) return -1;
        }

        // column - celeb is known by everyone except itself
        for(int i=0;i<n;i++) {
            if(M[i][potentialCeleb]==0 && i!=potentialCeleb) return -1;
        }

        return potentialCeleb;
    }
}