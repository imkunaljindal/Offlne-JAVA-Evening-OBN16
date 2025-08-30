package Patterns;

public class NumberPatterns {

    public static void main(String[] args) {
        int n = 5;
        //1111
        //1111
        //1111
        //1111
//        //1111
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=4;j++) {
//                System.out.print(1);
//            }
//            System.out.println();
//        }

        //1111
        //2222
        //3333
        //4444
        //5555
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=4;j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //12345
        //12345
        //12345
        //12345
//        for(int i=1;i<=4;i++) {
//            for(int j=1;j<=5;j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //****
        //****
        //****
        //****
//        for(int i=1;i<=4;i++) {
//            for(int j=1;j<=4;j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        //1
        //11
        //111
        //1111
        //11111
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(1);
//            }
//            System.out.println();
//        }

        //*
        //**
        //***
        //****
        //*****
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print('*');
//            }
//            System.out.println();
//        }

        //1
        //12
        //123
        //1234
        //12345
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //1
        //22
        //333
        //4444
        //55555
//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //5
        //54
        //543
        //5432
        //54321

//        for(int i=1;i<=5;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(6-j);
//            }
//            System.out.println();
//        }

        //5
        //44
        //333
        //2222
        //11111
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=i;j++) {
//                System.out.print(n+1-i);
//            }
//            System.out.println();
//        }

        //    1
        //   11
        //  111
        // 1111
        //11111
//        for(int i=1;i<=n;i++) {
//            // space loop
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(' ');
//            }
//            // char
//            for(int j=1;j<=i;j++) {
//                System.out.print('1');
//            }
//            System.out.println();
//        }

        //    1
        //   12
        //  123
        // 1234
        //12345
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(' ');
//            }
//            for(int j=1;j<=i;j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //    1
        //   22
        //  333
        // 4444
        //55555
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(' ');
//            }
//            for(int j=1;j<=i;j++) {
//                System.out.print(i);
//            }
//            System.out.println();
//        }

        //    5
        //   54
        //  543
        // 5432
        //54321
//        for(int i=1;i<=n;i++) {
//            for(int j=1;j<=n-i;j++) {
//                System.out.print(' ');
//            }
//            for(int j=5;j>=(n-i+1);j--) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }

        //    5
        //   44
        //  333
        // 2222
        //11111

        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(' ');
            }
            for(int j=1;j<=i;j++) {
                System.out.print(6-i);
            }
            System.out.println();
        }



    }
}
