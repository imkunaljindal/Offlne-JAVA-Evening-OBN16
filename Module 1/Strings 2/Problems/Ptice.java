import java.util.*;

public class Main {

    static void ptice(int n, String key) {
        String a = "ABC";
        String b = "BABC";
        String g = "CCAABB";

        int adrian = 0;
        int bruno = 0;
        int goran = 0;

        for(int i=0;i<n;i++) {
            if(a.charAt(i%3)==key.charAt(i)) {
                adrian++;
            }
            if(b.charAt(i%4)==key.charAt(i)) {
                bruno++;
            }
            if(g.charAt(i%6)==key.charAt(i)) {
                goran++;
            }
        }

        int maxScore = Math.max(adrian,Math.max(bruno,goran));

        System.out.println(maxScore);
        if(adrian==maxScore) System.out.println("Adrian");
        if(bruno==maxScore) System.out.println("Bruno");
        if(goran==maxScore) System.out.println("Goran");


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        n = sc.nextInt();
        String str = sc.next();
        ptice(n, str);
        sc.close();
    }
}