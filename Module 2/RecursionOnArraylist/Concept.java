import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Concept {

    static int findEvenSum(ArrayList<Integer> arr, int i) {
        if(i>=arr.size()) return 0;

        int sum = 0;
        if(arr.get(i)%2==0) sum += arr.get(i);
        return sum + findEvenSum(arr,i+1);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<n;i++) {
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println(findEvenSum(arr,0));
    }
}
