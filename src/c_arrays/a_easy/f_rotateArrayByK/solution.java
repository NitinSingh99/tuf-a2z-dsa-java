package c_arrays.a_easy.f_rotateArrayByK;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        rotate_rev2(arr, 2, "right");
    }

    //My solution (less efficient)
    private static void rotateRight(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = arr.length - 1; j > 0; j--) {
                int temp = arr[j - 1];
                arr[j - 1] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void rotateLeft(int[] arr, int k) {
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < arr.length - 1; j++) {
                int temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    //Optimized
    private static void rotate(int[] arr, int k, String direction) {
        int n = arr.length;
        if (n == 0 || k == 0) return;

        k = k % n;
        if (direction.equals("right")) {
            reverse(arr, 0, n - 1);
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
        } else if (direction.equals("left")) {
            reverse(arr, 0, k - 1);
            reverse(arr, k, n - 1);
            reverse(arr, 0, n - 1);
        }

        System.out.println(Arrays.toString(arr));
    }

    private static void reverse(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }


    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 7/10
    */
    private static void rotate_rev(int[] arr, int k, String direction) {
        if (arr.length == 0) return;
        k = k % arr.length;
        if (direction.equals("right")) {
            reverse_rev(arr, 0, arr.length - 1);
            reverse_rev(arr, 0, k - 1);
            reverse_rev(arr, k, arr.length - 1);
        } else if (direction.equals("left")) {
            reverse_rev(arr, 0, k - 1);
            reverse_rev(arr, k, arr.length - 1);
            reverse_rev(arr, 0, arr.length - 1);
        }

        System.out.println(Arrays.toString(arr));

    }

    private static void reverse_rev(int[] arr, int start, int end) {
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
    }

    /*
    Attempt: 3
    Status: SOLVED
    Confidence: 7/10
    */
    private static void rotate_rev2(int[] arr, int k, String direction) {
        if (k == 0) return;
        if (direction == "left") {
            reverse_rev(arr, 0, k - 1);
            reverse_rev(arr, k, arr.length - 1);
            reverse_rev(arr, 0, arr.length - 1);
        } else if (direction == "right") {
            reverse_rev2(arr, 0, arr.length - 1);
            reverse_rev2(arr, 0, k - 1);
            reverse_rev2(arr, k, arr.length - 1);
        }
            System.out.println(Arrays.toString(arr));
    }

    private static void reverse_rev2(int[] arr, int a, int b) {
        while (a < b) {
            int temp = arr[a];
            arr[a] = arr[b];
            arr[b] = temp;
            a++;
            b--;
        }
    }

}
