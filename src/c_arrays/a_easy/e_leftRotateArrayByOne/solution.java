package c_arrays.a_easy.e_leftRotateArrayByOne;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        rotate(arr, 1);
    }

    /*
    Attempt: 1
    Status: SOLVED
    Confidence: 8/10
    */
    private static void rotate(int[] arr, int n) {
        int temp = arr[0];
        for (int i = 1; i < arr.length; i++) {
            arr[i - 1] = arr[i];
        }
        arr[arr.length - 1] = temp;
        System.out.println(Arrays.toString(arr));
    }
}
