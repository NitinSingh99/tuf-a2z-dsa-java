package c_arrays.a_easy.m_longestSubArrayNegative;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {9, -3, 3, -1, 6, -5};
        subArray_rev(arr, 0);
    }

    private static void subarray(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int maxLen = 0;
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = i + 1;
            }
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }

            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
        }
        System.out.println(maxLen);
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 8/10
    */
    private static void subArray_rev(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        int maxLen = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
            if (sum == k) {
                maxLen = Math.max(maxLen, i + 1);
            }
            if (!map.containsKey(sum)) {
                map.put(sum, i);
            }
            if (map.containsKey(sum - k)) {
                int len = i - map.get(sum - k);
                maxLen = Math.max(maxLen, len);
            }
        }

        System.out.println(maxLen);
    }
}
