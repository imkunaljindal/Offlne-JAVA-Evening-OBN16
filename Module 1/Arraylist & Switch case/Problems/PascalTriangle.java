import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<ArrayList<Integer>> triangle = pascalTriangle(n);
        for (int i = 0; i < triangle.size(); i++) {
            for (int j = 0; j < triangle.get(i).size(); j++) {
                System.out.print(triangle.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }

    public static ArrayList<ArrayList<Integer>> pascalTriangle(int numRows) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=0;i<numRows;i++) {
            ArrayList<Integer> x = new ArrayList<>();
            for(int j=0;j<=i;j++) {
                if(j==0) x.add(1);
                else if(j==i) x.add(1);
                else {
                    x.add(ans.get(i-1).get(j-1) + ans.get(i-1).get(j));
                }
            }
            ans.add(x);
        }
        return ans;
    }
}
