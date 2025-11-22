public class SearchInInfiniteArray {

    static int binarySearch(int arr[], int target) {
        int s = 0;
        int e = 1;

        while(arr[e]<target) {
            s = e;
            e = 2*e;
        }

        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>target) e = mid-1;
            else s = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,8,5,4,3,2};
        int target = 8;
        System.out.println(binarySearch(arr,target));
    }
}
