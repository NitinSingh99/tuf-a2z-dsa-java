package step1.lec6.q2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args) {
        int[] arr = {10, 5, 10, 15, 10, 5};
        int n = arr.length;
        freq(arr, n);
    }

    private static void freq(int[] arr, int n) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue() );
        }
    }

    //Practice 01
    private static void freqq(int[] arr, int n){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        for(Map.Entry<Integer, Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
