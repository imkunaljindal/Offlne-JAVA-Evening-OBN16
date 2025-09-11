public class TimeComplexity {

    public static void main(String[] args) {
        int n = 5;

        //O(n)
        for(int i=0;i<n;i++) {
            System.out.println("Hello");
        }

        //O(10) -> O(1)
        for(int i=0;i<10000;i++) {
            System.out.println("Hello");
        }

        // O(2*n) -> O(n)
        for(int i=0;i<2*n;i++) {
            System.out.println("Hello");
        }

        // O(n^2)
        for(int i=0;i<n*n;i++) {
            System.out.println("Hello");
        }

        // O(n*n)
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                System.out.println("hello");
            }
        }

        // O(n^3)
        for(int i=0;i<n;i++) {
            for(int j=0;j<n;j++) {
                for(int k=0;k<n;k++) {
                System.out.println("hello");
                }
            }
        }

        // O(sqrt(n))
        for(int i=0;i*i<=n;i++) {
            System.out.println("Hello");
        }

        // O(logn)
        for(int i=1;i<=n;i=i*2) {
            System.out.println("Hello");
        }

        // O(logn)
        for(int i=n;i>=1;i=i/2) {
            System.out.println("Hello");
        }

        // O(infinite)
        for(int i=0;i<n;i=i*4) {
            System.out.println("Hello");
        }


        // O(n*sqrt(n))
        for(int i=0;i*i<n;i++) {
            for(int j=1;j<n;j=j+2) {
                System.out.println("Hello");
            }
        }

        // O(n)
        for(int i=n;i>=1;i=i-3) {
            System.out.println("Hello");
        }

        // O(1)
        for(int i=n;i<=1;i=i*2) {
            System.out.println("hello");
        }

    }
}
