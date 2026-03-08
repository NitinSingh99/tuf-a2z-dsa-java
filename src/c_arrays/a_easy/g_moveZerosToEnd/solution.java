package c_arrays.a_easy.g_moveZerosToEnd;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 0, 1, 0, 4, 0};
        moveZero_rev(arr);
    }


    //My solution -- works but inefficient
    private static void moveZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int j = i;
            if (arr[i] == 0) {
                while (arr[j] == 0 && j < arr.length - 1) {
                    j++;
                }
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    //Optimal Solution
    private static void moveZero_opt(int[] arr) {
        int j = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                j = i;
                break;
            }
        }

        if (j == -1) return;

        for (int i = j + 1; i < arr.length; i++) {
            if (arr[i] != 0) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                j++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 8/10
    */
    private static void moveZero_rev(int[] arr){

        int zero = -1;
        for(int i = 0; i<arr.length; i++){
           if(arr[i] == 0){
               zero = i;
               break;
           }
        }

        if(zero == -1) return;

        for(int i = zero; i<arr.length; i++){
            if(arr[i] != 0){
                int temp = arr[zero];
                arr[zero] = arr[i];
                arr[i] = temp;
                zero++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
