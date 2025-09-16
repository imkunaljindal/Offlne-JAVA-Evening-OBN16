import java.util.Scanner;

public class TernaryOperatorConcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        int n = (age>18)?1:2;
//        if(age > 18) {
//            n = 1;
//        }
//        else {
//            n = 2;
//        }

        System.out.println(n);
    }
}
