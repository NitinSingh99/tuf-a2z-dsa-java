package step1.lec6.q3;

import java.net.Inet4Address;
import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        freq_rev(arr, n);
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

    //Revisit 1 -- O
    private static void freq_rev(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }
        int max = Integer.MIN_VALUE;
        int maxEl = 0;
        int minEl = 0;
        int min = Integer.MAX_VALUE;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > max) {
                max = entry.getValue();
                maxEl = entry.getKey();
            }

            if(entry.getValue() < min){
                min = entry.getValue();
                minEl = entry.getKey();
            }

        }

        System.out.println("Max: " + maxEl);
        System.out.println("Min: " + minEl);
    }
}
