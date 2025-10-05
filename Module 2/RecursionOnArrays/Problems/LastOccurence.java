import java.util.Scanner;



class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        int[] A = new int[N];
        for(int i = 0; i < N; i++){
            A[i] = s.nextInt();
        }
        int T = s.nextInt();
        System.out.println(lastIndex(A, T, 0));
    }

    static int lastIndex(int A[],int T,int startIndex)
    {
        return helper(A,T,A.length);
//        if(startIndex >= A.length) return -1;
//        int index = lastIndex(A,T,startIndex+1);
//        if(index!=-1) return index;
//        if(A[startIndex]==T) return startIndex;
//        return -1;
    }

    public static int helper(int A[], int T, int n) {
        if(n==0) return -1;
        if(A[n-1]==T) return n-1;
        return helper(A,T,n-1);
    }
}