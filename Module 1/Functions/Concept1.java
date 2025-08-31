public class Concept1 {

    static void fun1(int x) {
        System.out.println("A");
        System.out.println("B");
        if(x<10) return;

        System.out.println("D");
    }

    static int fun2(int x) {
        int val = x*5;
        return val;
    }

    public static void main(String[] args) {
        System.out.println(fun2(10));
        fun1(20);
    }
}
