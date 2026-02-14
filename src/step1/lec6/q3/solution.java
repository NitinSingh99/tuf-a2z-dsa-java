package step1.lec6.q3;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        freq(arr, n);
    }

    private static void freq(int[] arr, int n) {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int highest = 0;
        int hInd = 0;
        int lInd = 0;
        int lowest = n;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > highest) {
                highest = entry.getValue();
                hInd = entry.getKey();
            } else if (entry.getValue() <= lowest) {
                lowest = entry.getValue();
                lInd = entry.getKey();
            }
        }

        System.out.print("Lowest: " + lInd + ", Highest: " + hInd);
    }
}
