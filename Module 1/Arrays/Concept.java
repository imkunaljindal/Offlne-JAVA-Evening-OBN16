import java.util.Scanner;

public class Concept {

    public static void main(String[] args) {
//
//        int arr[] = new int[10]; // declare an array of size 10 which will store ints
//
//        arr[0] = 10;
//        arr[3] = 20;
//        arr[7] = 40;
//        arr[-5] = 50;  // out of bounds
//
//        System.out.println(arr[5]);
//        System.out.println(arr[9]);
//        System.out.println(arr[7]);

//        int arr2[] = new int[5];
//        arr2[0] = 5;
//        arr2[2] = 10;
//        arr2[1] = 70;
//        arr2[4] = 100;
//        arr2[3] = 67;
//
//        for(int i=0;i<5;i++) {
//            System.out.println(arr2[i]);
//        }

        Scanner sc = new Scanner(System.in);

       // float arr[] = new float[5];
//        arr[0] = sc.nextFloat();
//        arr[1] = sc.nextFloat();
//        arr[2] = sc.nextFloat();
//        arr[3] = sc.nextFloat();
//        arr[4] = sc.nextFloat();

//        for(int i=0;i<5;i++) {
//            arr[i] = sc.nextFloat();
//        }
//
//        for(int i=0;i<5;i++) {
//            System.out.println(i + " = " + arr[i]);
//        }

//        int arr[] = new int[7];
//
//        //input
//        for(int i=0;i<7;i++) {
//            arr[i] = sc.nextInt();
//        }

        // output
//        int sum = 0;
//        int product = 1;
//        for(int i=0;i<7;i++) {
//            sum = sum + arr[i];
//            product = product*arr[i];
//        }
//        System.out.println(sum);
//        System.out.println(product);
//
//        int x[] = {5,8,5,6,58};
//        System.out.println(x.length);

//        System.out.println(Integer.MIN_VALUE);
//        System.out.println(Integer.MAX_VALUE);

        int a = sc.nextInt();
        int b = sc.nextInt();

        // write a program to swap two numbers
        int temp = a;
        a = b;
        b = temp;

        System.out.println("a = "+ a);
        System.out.println("b = "+b);


    }
}
