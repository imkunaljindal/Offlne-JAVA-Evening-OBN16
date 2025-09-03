public class Concept2 {

    static void fun1() {
        System.out.println("A");
    }

    static void fun2() {
        System.out.println("B");
    }

    static int add(int n) {
        n = n+5;
        System.out.println(n);
        return n;
    }

    public static void main(String[] args) {
        int n = 10;
        n = add(n);
        System.out.println(n);

    }
}
