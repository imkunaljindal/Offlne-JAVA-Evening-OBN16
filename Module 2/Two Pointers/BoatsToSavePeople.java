import java.io.*;
import java.util.*;
class Solution
{
    public static int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int left = 0;
        int right = people.length-1;
        int count = 0;

        while(left<=right) {
            if(people[left]+people[right] <= limit) {
                left++;
               // right--;
            }
//            else {
//                right--;
//            }
            count++;
            right--;
        }

        return count;
    }
}
public class Main {


    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++)
        {
            nums[i] = sc.nextInt();
        }
        System.out.println(Solution.numRescueBoats(nums, k));
    }

}
