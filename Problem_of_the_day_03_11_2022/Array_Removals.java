package Problem_of_the_day_03_11_2022;

import java.util.Arrays;

public class Array_Removals {
    /**
     * @param arr
     * @param n
     * @param k
     * @return
     */
    static int removals(int[] arr, int n, int k) {
        if(n==1) return 0;        
       Arrays.sort(arr);
       int bArrL = 0;
       for(int i=0; i<n-1; i++) {
           int j=i+1;
           if(n-j < bArrL) break;
           while(j<n && arr[j] - arr[i] < k) {j++;} 
           bArrL = Math.max(bArrL, j-i);
       }
       return n - bArrL;
   }
   public static void main(String[] args) {
    int arr[] = {1,3,4,9,10,11,12,17,20};
    int N = 9, K = 4  ;
    System.out.println(removals(arr,N,K));
   }
}
