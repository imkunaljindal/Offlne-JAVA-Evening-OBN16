import java.util.Scanner;

public class BreakContinue {
    public static void main(String[] args) {

//        for(int i=1;i<=10;i++) {
//            if(i>5) {
//                break;
//            }
//            System.out.println(i);
//        }

//        Scanner sc = new Scanner(System.in);
//
//        while(true) {
//            int x = sc.nextInt();
//            if(x%7==0) {
//                break;
//            }
//        }
//
//        for(int i=1;i<=10;i++) {
//            if(i==4) {
//                continue;
//            }
//            System.out.println(i);
//        }

        for(int i=1;i<=100;i++) {
            if(i%3==0 && i%5==0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
