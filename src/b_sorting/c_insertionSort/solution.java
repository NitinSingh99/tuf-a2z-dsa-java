package b_sorting.c_insertionSort;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 4, 1, 1};
        insertionSort2(arr);
    }

    /*
    Attempt: 1
    Status: SOLVED
    Confidence: 6/10
    */
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

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 6/10
    */
    private static void insertionSort2(int[] arr){
        for(int i = 1; i<arr.length; i++){
            int cur = arr[i];
            for(int j = i-1; j>=0; j--){
                if(cur < arr[j]){
                    arr[j+1] = arr[j];
                    arr[j] = cur;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }


}
