import java.util.*;

public class DistictWindow {

    public static String DistinctWindow(String s){
        Set<Character> st = new HashSet<>();
        for(int i=0;i<s.length();i++) st.add(s.charAt(i));

        int k = st.size(); // no of distinct char

        // <char,freq>
        HashMap<Character,Integer> freq = new HashMap<>();
        int start = 0;
        int end = 0;

        int minLength = s.length();
        int startIdx = 0;

        while(end<s.length()) {
            char c = s.charAt(end);
            freq.put(c,freq.getOrDefault(c,0)+1);

            // valid
            while(freq.size()==k) {
                if(end-start+1 < minLength) {
                    minLength = end-start+1;
                    startIdx = start;
                }

                char x = s.charAt(start);
                freq.put(x,freq.getOrDefault(x,0)-1);
                if(freq.get(x)==0) freq.remove(x);
                start++;
            }
            end++;
        }

        return s.substring(startIdx,startIdx+minLength);
    }

    public static void main(String[] args) throws Throwable {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String ans = DistinctWindow(s);
        System.out.println(ans);
    }
}