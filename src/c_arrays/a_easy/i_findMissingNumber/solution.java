package c_arrays.a_easy.i_findMissingNumber;

import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

public class solution {
    public static void main(String[] args) {
        int[] arr = {8, 2, 4, 5, 3, 6, 1};
        finMissingNo_rev(arr);
    }

    //My solution using Map
    private static void findMissingNumber(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();

        int n = arr.length;

        for (int i = 1; i <= n + 1; i++) {
            map.put(i, 0);
        }

        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 0) {
                System.out.println(entry.getKey());
            }
        }
    }

    //Little better (Array element ≈ 4 bytes whereas HashMap entry ≈ 36+ bytes)
    private static void findMissingNo(int[] arr) {
        int n = arr.length;
        int[] hash = new int[n + 2];

        for (int i : arr) {
            hash[i]++;
        }

        for (int j = 1; j < hash.length; j++) {
            if (hash[j] == 0) {
                System.out.println(j);
            }
        }
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 8/10
    */
    private static void finMissingNo_rev(int[] arr) {
        int n = arr.length+2;
        int[] res = new int[n];
        for (int i : arr) {
            res[i]++;
        }

        for (int j = 1; j<res.length; j++) {
            if (res[j] == 0) {
                System.out.println(j);
            }
        }
    }

}
