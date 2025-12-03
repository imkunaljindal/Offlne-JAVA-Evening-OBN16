import java.io.*;
import java.util.*;

class Solution {
    public boolean arrayPairs(int[] arr, int k) {
        HashMap<Integer,Integer> freq = new HashMap<>();
        for(int i=0;i<arr.length;i++) {
            int key = arr[i]%k;
            freq.put(key,freq.getOrDefault(key,0)+1);
        }

        for(int key: freq.keySet()) {
            if(key==0) {
                if(freq.get(key)%2!=0) return false;
            }
            else {
                int comp = k-key;
                if(freq.get(key)!=freq.get(comp)) return false;
            }
        }
        return true;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,k;
        n = sc.nextInt();
        k = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++)
            arr[i] = sc.nextInt();
        Solution Obj = new Solution();
        if(Obj.arrayPairs(arr,k)){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}