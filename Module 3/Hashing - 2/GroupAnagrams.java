
// A Java program to print all anagrams together
import java.awt.image.AreaAveragingScaleFilter;
import java.util.*;

public class Main {
    static String sortString(String str) {
        char ch[] = str.toCharArray(); // "cat" -> ['c','a','t']
        Arrays.sort(ch); // ['a','c','t'];
        return String.valueOf(ch); // "act"
    }

    static void printAnagramsTogether(String wordArr[], int size) {
        // <sorted anagram, <List of anagrams>>
       HashMap<String,ArrayList<String>> mp = new HashMap<>();
       ArrayList<String> keysOrder = new ArrayList<>();

       for(int i=0;i<wordArr.length;i++) {
           String sortedKey = sortString(wordArr[i]); // "cat" -> "act"
           if(!mp.containsKey(sortedKey)) {
               mp.put(sortedKey,new ArrayList<>()); // "act" -> []
               ArrayList<String> currList = mp.get(sortedKey);
               currList.add(wordArr[i]); // ["cat"]
               mp.put(sortedKey,currList);  //"act" -> ["cat"]
               keysOrder.add(wordArr[i]);
           }
           else {
               ArrayList<String> currList = mp.get(sortedKey);
               currList.add(wordArr[i]); // ["cat","tac"]
               mp.put(sortedKey,currList); //"act" -> ["cat","tac"]
           }
       }

       Collections.sort(keysOrder);

       for(int i=0;i<keysOrder.size();i++) {
           String key = sortString(keysOrder.get(i));
           for(String val: mp.get(key)) {
               System.out.print(val + " ");
           }
       }
    }

    // Driver program to test above functions
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] wordArr = new String[n];
        for (int i = 0; i < n; i++)
            wordArr[i] = sc.next();
        sc.close();
        printAnagramsTogether(wordArr, n);
    }
}