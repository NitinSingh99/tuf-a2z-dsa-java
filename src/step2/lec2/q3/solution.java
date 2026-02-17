package step2.lec2.q3;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        insertionSort(arr, 1);
        System.out.print(Arrays.toString(arr));
    }

    private static void insertionSort(int[] arr, int ind) {
        if (ind == arr.length) return;
        int cur = arr[ind];
        int i = ind - 1;

        while (i >= 0 && arr[i] > cur) {
            arr[i + 1] = arr[i];
            i--;
        }

        arr[i+1] = cur;
        insertionSort(arr, ind + 1);
    }
}
