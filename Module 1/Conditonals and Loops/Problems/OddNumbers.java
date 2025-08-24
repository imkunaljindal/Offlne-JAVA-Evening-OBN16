package Problems;

import java.util.*;

class OddNumbers {
    public static void main(String args[]) {
        Scanner sc=new Scanner(System.in);

        int x = sc.nextInt();
        int count = 1;
        for(;x%2!=1;) {
            count = count+1;
            x = sc.nextInt();
        }

        System.out.println(count);
    }
}