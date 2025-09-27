import java.util.*;

public class Main {
    static void SubString(String str) {
        int n = str.length();
        for(int i=0;i<n;i++) {
            String ans = "";
            for(int j=i;j<n;j++) {
                ans += str.charAt(j);
                System.out.println(ans);
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        SubString(str);
    }
}