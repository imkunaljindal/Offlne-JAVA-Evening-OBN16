public class DecreasingBinarySearch {

    static int decBinarySearch(int arr[], int target) {
        int s = 0;
        int e = arr.length-1;

        while(s<=e) {
            int mid = s + (e-s)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid] < target) e = mid-1;
            else s = mid+1;
        }

        return -1;
    }

    public static void main(String[] args) {
        int arr[] = {10,8,5,4,3,2};
        int target = 8;
        System.out.println(decBinarySearch(arr,target));
    }
}
