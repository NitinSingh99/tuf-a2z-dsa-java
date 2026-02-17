package step2.lec2.q2;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
        bubbleSort(arr, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    private static void bubbleSort(int[] arr, int n) {
        if (n == 0) return;
        int didSwap = 0;
        for (int i = 0; i < n; i++){
            if(arr[i]>arr[i+1]){
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
                didSwap = 1;
            }
        }

        if(didSwap == 0) return;

        bubbleSort(arr, n-1);
    }
}
