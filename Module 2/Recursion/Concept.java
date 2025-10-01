public class Concept {

    static int fact(int n) {
        //if(n==1) return 1;
        int x = fact(n-1);  // Faith will always return correct answer
        return n*x;
    }
    public static void main(String[] args) {
        System.out.println(fact(5));
    }
}
