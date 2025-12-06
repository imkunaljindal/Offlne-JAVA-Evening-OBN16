import java.util.*;

public class SubStringWithKUniqueCharacters {

    public static int longestkSubstr(int n, int k,String s){
        // <char, freq>
        HashMap<Character,Integer> freq = new HashMap<>();

        int start = 0;
        int end = 0;
        int maxLength = -1;
        int startIdx = -1;

        while(end < n) {
            char c = s.charAt(end);
            freq.put(c,freq.getOrDefault(c,0)+1);

            // valid window
            if(freq.size()==k) {
                startIdx = start;
                maxLength = Math.max(maxLength,end-start+1);
            }

            // shrink till window is invalid
            while(freq.size() > k) {
                char x = s.charAt(start);
                freq.put(x,freq.getOrDefault(x,0)-1);
                if(freq.get(x)==0) freq.remove(x);
                start++;
            }
            end++;
        }

        System.out.println(s.substring(startIdx,startIdx+maxLength));

        return maxLength;
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        String s = sc.next();
        int ans = longestkSubstr(n,k,s);
        System.out.println(ans);
    }
}