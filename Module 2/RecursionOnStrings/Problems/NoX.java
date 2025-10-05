package Problems;

import java.util.*;

public class NoX {
    static String noX(String s) {

        if(s.length()==0) return "";

        // x -> ignore
        if(s.charAt(0)=='x') return noX(s.substring(1));

        // not x -> keep the char
        return s.charAt(0) + noX(s.substring(1));

    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        System.out.println(noX(s));
    }
}