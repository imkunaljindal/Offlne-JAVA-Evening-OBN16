import java.util.HashMap;

public class CountFrequency {

    public static void main(String[] args) {

        String s = "akjdnkaslsfjdoiflkajdo";

        // build a frequency map
        HashMap<Character,Integer> freqMap = new HashMap<>();

        for(int i = 0;i<s.length();i++) {
            char c = s.charAt(i);
//            if(!freqMap.containsKey(c))  {
//                freqMap.put(c,1);
//            }
//            else {
//                int currFreq = freqMap.get(c);
//                freqMap.put(c,currFreq+1);
//            }
            int currFreq = freqMap.getOrDefault(c,0);
            freqMap.put(c,currFreq+1);
        }
    }
}
