package b_sorting.a_selectionSort;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {13, 46, 24, 52, 20, 9};
        selectionSort3(arr);
    }

    /*
    Attempt: 1
    Status: SOLVED
    Confidence: 7/10
    */
    private static void selectionSort(int[] arr) {
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }
        System.out.print(Arrays.toString(arr));
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 7/10
    */
    private static void selectionSort2(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int min = arr[i];
            for (int j = i; j < n; j++) {
                if (arr[j] < min) {
                    int temp = min;
                    min = arr[j];
                    arr[j] = temp;
                }
            }
            arr[i] = min;
        }
        System.out.println(Arrays.toString(arr));
    }

    /*
    Attempt: 3
    Status: SOLVED
    Confidence: 8/10
    Date: 28-02-2026
    */
    private static void selectionSort3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int minIndex = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[minIndex];
            arr[minIndex] = temp;
        }

        System.out.println(Arrays.toString(arr));
    }
}
