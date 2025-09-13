import java.util.Scanner;

public class Concept {

    public static void main(String[] args) {
//        int arr[][] = new int[3][4]; // 3 X 4 matrix
//        arr[1][1] = 10;

        Scanner sc = new Scanner(System.in);
//        int arr[][] = new int[3][2];
//
//        for(int i=0;i<3;i++) {
//            for(int j=0;j<2;j++) {
//                arr[i][j] = sc.nextInt();
//            }
//        }
//
//        for(int i=0;i<3;i++) {
//            for(int j=0;j<2;j++) {
//                System.out.print(arr[i][j] + " ");
//            }
//            System.out.println();
//        }

        int a[][] = new int[3][4];  // 3 rows X 4 columns
        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                a[i][j] = sc.nextInt();
            }
        }

        for(int i=0;i<3;i++) {
            for(int j=0;j<4;j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
