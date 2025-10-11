import java.util.*;
class Accio {

    static void helper(String s, Set<String> ans, String perm) {

        if(s.length()==0) {
            ans.add(perm);
            return;
        }

        for(int i=0;i<s.length();i++) {
            char c = s.charAt(i);
            String rem = s.substring(0,i) + s.substring(i+1);
            helper(rem,ans,perm+c);
        }
    }

    public void printPermutations(String str) {
        // str = "bac"
        char arr[] = str.toCharArray(); // ['b','a','c']
        Arrays.sort(arr); // ['a','b','c']
        String s = new String(arr); // s = "abc"

        Set<String> ans = new TreeSet<>();
        helper(s,ans,"");

        for(String x: ans) {
            System.out.println(x);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        Accio Obj = new Accio();
        Obj.printPermutations(str);
    }
}