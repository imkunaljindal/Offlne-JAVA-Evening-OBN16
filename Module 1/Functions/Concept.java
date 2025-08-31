public class Concept {

    static int fact(int x) {
        int fact = 1;
        for(int i=1;i<=x;i++) {
            fact = fact*i;
        }

        return fact;
    }

    static void sayHello(String name) {
        System.out.println("Hello "+name);
    }

    static int add(int a, int b) {
        int sum = a+b;
        return sum;
    }

    static int multiply(int x, int y) {
        int mul = x*y;
        return mul;
    }

    public static void main(String[] args) {
//        int n = 5;
//        int r = 3;
//        int n_fact = fact(n);
//        int r_fact = fact(r);
//        int n_r_fact = fact(n-r);
//        int ans = n_fact/(r_fact*n_r_fact);
//        sayHello("Kunal");

        int sum = add(5,10);
        System.out.println(sum);

        System.out.println(multiply(5,4));


    }
}
