import java.util.*;

class Solution {
    static boolean areAnagram(String c1, String c2) {
        int[] freqC1 = new int[26];
        int[] freqC2 = new int[26];

        for(int i=0;i<c1.length();i++) {
            freqC1[c1.charAt(i)-'a']++;
        }

        for(int i=0;i<c2.length();i++) {
            freqC2[c2.charAt(i)-'a']++;
        }

        for(int i=0;i<26;i++) {
            if(freqC1[i]!=freqC2[i]) return false;
        }

        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str1 = sc.nextLine();
        String str2 = sc.nextLine();
        Solution Obj = new Solution();

        if (Obj.areAnagram(str1, str2))
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
