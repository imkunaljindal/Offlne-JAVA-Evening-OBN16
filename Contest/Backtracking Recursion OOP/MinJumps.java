import java.io.*;
import java.util.*;
class Solution{
    public static int minJumps(int []jumps){
        //write your code here
    }
}
public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }



        System.out.println(Solution.minJumps(arr));
    }

}