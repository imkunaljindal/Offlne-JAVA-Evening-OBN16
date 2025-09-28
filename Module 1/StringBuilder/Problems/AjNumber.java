import java.util.*;
public class Main {
    public static void main(String args[]) {
        Scanner input = new Scanner(System.in);
        int n=input.nextInt();
        input.nextLine();
        StringBuilder str=new StringBuilder(input.nextLine());

        solve(str,n);

        input.close();
    }

    static boolean isAjNumber(Long num) {
        if(num==0 || num==1) return false;
        int arr[] = {2,3,5,7,11,13,17,19,23,29};

        for(int i=0;i<arr.length;i++) {
            if(arr[i]==num) return true;
        }

        for(int i=0;i<arr.length;i++) {
            if(num%arr[i]==0) return false;
        }
        return true;
    }

    static boolean checkIsUsed(boolean[] isUsed, int i, int j) {
        for(int k=i;k<=j;k++) {
            if(isUsed[k]==true) return false;
        }
        return true;
    }

    public static void solve(StringBuilder str,int n){

        boolean isUsed[] = new boolean[n];
        int count = 0;
        for(int len=1;len<=n;len++) {
            for(int i=0;i<=n-len;i++) {
                long x = Long.parseLong(str.substring(i,i+len));
                if(isAjNumber(x) && checkIsUsed(isUsed,i,i+len-1)) {
                    System.out.println(x);
                    count++;
                    for(int k=i;k<i+len;k++) isUsed[k] = true;
                }
            }
        }
        System.out.println(count);
    }
}