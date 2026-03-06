package c_arrays.a_easy.l_longestSubarray;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, -1, 5, -2, 3};
        int k = 3;
        longestSubarray(arr, k);
    }

    //fails for certain cases with negative elements int[] arr = {1, -1, 5, -2, 3}; k=3;
    //The best solution in case of positive nos.
    private static void find(int[] arr, int k) {
        int left = 0, right = 0;
        int sum = arr[0];
        int maxLen = 0;
        int n = arr.length;

        while(right<n){

            while(left<=right && sum>k){
                sum -= arr[left];
                left++;
            }

            if(sum == k){
                maxLen = Math.max(maxLen, right-left+1);
            }

            right++;
            if(right<n){
                sum += arr[right];
            }
        }

        System.out.println(maxLen);
    }

    private static void longestSubarray(int[] arr, int k){
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for(int i = 0; i<arr.length; i++){
            sum += arr[i];
            if(sum == k){
                maxLen = i+1;
            }
            if(map.containsKey(sum-k)){
                int len = i - map.get(sum-k);
                maxLen = Math.max(maxLen, len);
            }
            if(!map.containsKey(sum)){
                map.put(sum, i);
            }
        }

        System.out.println(maxLen);
    }

}
