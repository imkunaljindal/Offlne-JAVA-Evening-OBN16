public class Subarrays {

    public static void main(String[] args) {
        int arr[] = {3,1,2,4};
        int n = arr.length;
        int ans = Integer.MIN_VALUE;
//        for(int i=0;i<n;i++) {
//            for(int j=i;j<n;j++) {
//                int sum = 0;
//                for(int k=i;k<=j;k++) { // i...j
//                    sum = sum + arr[k];
//                }
//                if(sum > ans) {
//                    ans = sum;
//                }
//            }
//        }

        for(int i=0;i<n;i++) {
            int sum = 0;
            for(int j=i;j<n;j++) {
                sum = sum + arr[j];
                if(sum > ans) ans = sum;
            }
        }
    }
}
