public class PrePostIncDec {

    public static void main(String[] args) {

//        int a = 5;
//        int b = ++a;
//        int c = --b;
//        int d = b--;
//        System.out.println(a);
//        System.out.println(b);
//        System.out.println(c);
//        System.out.println(d);
//
//        int e = 10;
//        e--;
//        --e;

        int a = 5;
        int b = a++ + a + --a + a++;
        System.out.println(b);
        System.out.println(a);




    }
}
