import java.util.*;

public class Main {

    static int[] subtract(int[] n1, int[] n2) {
        List<Integer> sub = new ArrayList<>();
        int i = n1.length - 1, j = n2.length - 1, c = 0;
        while (i >= 0 || j >= 0) {
            int a = i < 0 ? 0 : n1[i--];
            int b = j < 0 ? 0 : n2[j--];
            int sum = a - b + c;
            if (sum < 0) {
                c = -1;
                sum += 10;
            } else {
                c = 0;
            }
            sub.add(sum);
        }

        // Swap num1 and num2, then do it again.
        if (c < 0) {
            int[] tmp = subtract(n2, n1);
            tmp[0] *= -1;
            return tmp;
        }
        Collections.reverse(sub);

        // Remove leading zeros
        int start = 0;
        while (sub.get(start) == 0 && start < sub.size() - 1) start++;
        int[] ans = new int[sub.size() - start];
        for (int k = 0; k + start < sub.size(); k++) {
            ans[k] = sub.get(start + k);
        }
        return ans;
    }

    /* Driver program to test above function */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int[] arr1 = new int[n1];
        for (int i = 0; i < n1; i++) arr1[i] = sc.nextInt();

        int n2 = sc.nextInt();
        int[] arr2 = new int[n2];
        for (int i = 0; i < n2; i++) arr2[i] = sc.nextInt();
        sc.close();

        int[] res = subtract(arr1, arr2);
        for (int i : res) System.out.println(i);
    }
}
