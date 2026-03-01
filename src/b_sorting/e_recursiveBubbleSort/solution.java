package b_sorting.e_recursiveBubbleSort;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort2(arr, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    /*
    Attempt: 1
    Status: FAILED
    Confidence: 5/10
    */
    private static void bubbleSort(int[] arr, int n) {
        if (n == 0) return;
        int didSwap = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > arr[i + 1]) {
                int temp = arr[i];
                arr[i] = arr[i + 1];
                arr[i + 1] = temp;
                didSwap = 1;
            }
        }

        if (didSwap == 0) return;

        bubbleSort(arr, n - 1);
    }

    /*
    Attempt: 2
    Status: Solved
    Confidence: 8/10
    Date: 01-03-26
    */
    private static void bubbleSort2(int[] arr, int n) {
        if (n <= 0) return;
        int didSwap = 0;
        for (int i = 1; i <= n; i++) {
            if (arr[i - 1] > arr[i]) {
                int temp = arr[i];
                arr[i] = arr[i - 1];
                arr[i - 1] = temp;
                didSwap = 1;
            }
        }

        if (didSwap == 0) return;

        bubbleSort2(arr, --n);
    }
}
