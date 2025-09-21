import java.util.*;

public class SelectionSort {
    public static int[] SelectionSort(int[] arr) {
        int n = arr.length;
        for(int i=0;i<n;i++) {
            int minEle = i;
            for(int j=i+1;j<n;j++) {
                if(arr[j] < arr[minEle]) {
                    minEle = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minEle];
            arr[minEle] = temp;
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        int[] ans = SelectionSort(arr);

        for(int a : ans)
            System.out.print(a + " ");
    }
}