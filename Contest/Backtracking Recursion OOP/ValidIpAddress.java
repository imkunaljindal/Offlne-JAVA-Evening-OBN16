import java.util.*;

public class Main {
    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Solution.printValidIPAddresses(str, 0, "", 0);
    }
}
class Solution {
    public static void printValidIPAddresses(String str, int index, String result, int count) {
        if (count == 4) {
            if (index == str.length()) {
                System.out.println(result);
            }
            return;
        }
        for (int i = 1; i <= 3; i++) { // picking the number of digits [0-255]
            if (index + i > str.length()) {
                break;
            }
            String s = str.substring(index, index + i);
            if (s.startsWith("0") && s.length() > 1 || (i == 3 && Integer.parseInt(s) >= 256)) {
                continue;
            }
            printValidIPAddresses(str, index + i, result + s + (count == 3 ? "" : "."), count + 1);
        }
    }
}