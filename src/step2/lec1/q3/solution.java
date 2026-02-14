package step2.lec1.q3;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 1, 1};
        insertionSort(arr);
    }

    private static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int cur = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if (arr[j] > cur) {
                    arr[j+1] = arr[j];
                    arr[j] = cur;

                }
            }
        }
        System.out.print(Arrays.toString(arr));
    }
}
