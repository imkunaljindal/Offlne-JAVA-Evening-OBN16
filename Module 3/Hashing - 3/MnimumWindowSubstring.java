import java.io.*;
import java.util.*;

class Solution {
    static boolean isValid(int freqS[], int freqT[]) {
        for(int i=0;i<256;i++) {
            if(freqS[i] < freqT[i]) return false;
        }

        return true;
    }

    public String minWindow(String s, String t) {
        int []freqT = new int[256];
        for(int i=0;i<t.length();i++) {
            freqT[t.charAt(i)]++;
        }

        int freqS[] = new int[256];
        int start = 0;
        int end = 0;

        int minLength = Integer.MAX_VALUE;
        int startIdx = -1;

        while(end<s.length()) {
            freqS[s.charAt(end)]++;

            // window valid
            while(isValid(freqS,freqT)) {
                if(end-start+1 < minLength) {
                    minLength = end-start+1;
                    startIdx = start;
                }
                freqS[s.charAt(start)]--;
                start++;
            }
            end++;
        }

        return s.substring(startIdx,startIdx+minLength);


    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s,t;
        s = sc.next();
        t = sc.next();
        Solution Obj = new Solution();
        System.out.print(Obj.minWindow(s,t));
    }
}