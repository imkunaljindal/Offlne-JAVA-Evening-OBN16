import java.util.Scanner;

public class SwitchCaseConcept {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesdsay");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }

//        if(n==1) {
//            System.out.println("Monday");
//        }
//        else if(n==2) {
//            System.out.println("Tuesday");
//        }
//        else if(n==3) {
//            System.out.println("Wedensday");
//        }
//        else if(n==4) {
//            System.out.println("thursday");
//        }
//        else if(n==5) {
//            System.out.println("Friday");
//        }
//        else if(n==6) {
//            System.out.println("Saturday");
//        }
//        else if(n==7) {
//            System.out.println("Sunday");
//        }
//        else {
//            System.out.println("Invalid Input");
//        }
    }
}
