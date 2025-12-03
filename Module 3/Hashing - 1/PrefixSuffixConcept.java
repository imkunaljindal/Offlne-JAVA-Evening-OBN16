public class PrefixSuffixConcept {

    public static void main(String[] args) {
        int arr[] = {3,4,5,1,2,6};
        int n = arr.length;
        int prefix[] = new int[n];

        prefix[0] = arr[0];
        for(int i=1;i<n;i++) {
            prefix[i] = prefix[i-1] + arr[i];
        }

        for(int i=0;i<n;i++) {
            System.out.print(prefix[i] + " ");
        }

        int[] suffix = new int[n];
        suffix[n-1] = arr[n-1];

        for(int i=n-2;i>=0;i--) {
            suffix[i] = suffix[i+1] + arr[i];
        }

        for(int i=0;i<n;i++) {
            System.out.print(suffix[i] + " ");
        }
    }
}
