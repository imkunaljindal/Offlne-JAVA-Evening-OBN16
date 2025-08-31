package Patterns;

public class CharacterPatterns {

    public static void main(String[] args) {

        int n = 5;
        //aaaa 97 96
        //bbbb 98 96+2
        //cccc 99 96+3
        //dddd 100
        //eeee

//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=4;j++) {
//                System.out.print((char)(96+i));
//            }
//            System.out.println();
//        }

        //abcd
        //abcd
        //abcd
        //abcd
        //abcd

//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=4;j++) {
//                System.out.print((char)(96+j));
//            }
//            System.out.println();
//        }

        //A 64+1
        //AB 64+1 64+2
        //ABC
        //ABCD
        //ABCDE
       /* for(int i=1;i<=30;i++) {
            char c = 'A';
            for(int j=1;j<=i;j++) {
                System.out.print(c);
                c++;
                if(c>'Z') c = 'A';
            }
            System.out.println();
        }*/

        //A 64+1
        //AB 64+1 64+2
        //ABC
        //ABCD
        //ABCDE
//        for(int i=1;i<=30;i++) {
//            for(int j=0;j<i;j++) {
//                System.out.print((char)(65+(j%26)));
//            }
//            System.out.println();
//        }

        //A
        //BC
        //DEF
        //GHIJ
        //KLMNO

//        char c = 'A';
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(c);
//                c++;
//                if(c>'Z') c = 'A';
//            }
//            System.out.println();
//        }
//
        //    A
        //   AB
        //  ABC
        // ABCD
        //ABCDE

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(' ');
            }
            char c = 'A';
            for(int j=1;j<=i;j++) {
                System.out.print(c);
                c++;
                if(c>'Z') c = 'A';
            }
            System.out.println();
        }
    }
}
