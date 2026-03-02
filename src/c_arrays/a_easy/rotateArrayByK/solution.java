package c_arrays.a_easy.rotateArrayByK;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
//        rotateRight(arr, 4);
//        rotateLeft(arr, 2);
        rotate(arr, 2, "left");
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
        }else if(direction.equals("left")){
            reverse(arr, 0, k-1);
            reverse(arr, k, n-1);
            reverse(arr, 0, n-1);
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
}
