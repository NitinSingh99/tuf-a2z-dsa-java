package c_arrays.b_medium.b_sortArray;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 0, 2, 1, 0};
        sort_opt(arr);
    }


    private static void sort(int[] arr) {
        for (int j = arr.length; j > 0; j--) {
            for (int i = 1; i < j; i++) {
                if (arr[i] < arr[i - 1]) {
                    int temp = arr[i];
                    arr[i] = arr[i - 1];
                    arr[i - 1] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

    }

    //Dutch National Flag Algorithm
    private static void sort_opt(int[] arr){
        int low = 0, mid = 0, high = arr.length-1;
        while(mid<=high){
            switch (arr[mid]){
                case 0:
                    int temp = arr[low];
                    arr[low] = arr[mid];
                    arr[mid] = temp;
                    mid++;
                    low++;
                    break;

                case 1:
                    mid++;
                    break;

                case 2:
                    int temp2 = arr[high];
                    arr[high] = arr[mid];
                    arr[mid] = temp2;
                    high--;
                    break;

            }

        }

        System.out.println(Arrays.toString(arr));
    }
}
