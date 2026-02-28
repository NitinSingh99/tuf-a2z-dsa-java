package b_sorting.b_bubbleSort;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort2(arr);
    }

    /*
    Attempt: 1
    Status: SOLVED
    Confidence: 6/10
    */
    private static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = n - 1; i >= 0; i--) {
            for (int j = 0; j < i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }

        }
        System.out.print(Arrays.toString(arr));
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 7/10
    */
    private static void bubbleSort2(int[] arr) {
        for (int i = arr.length; i > 0; i--) {
            for (int j = 1; j < i; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
