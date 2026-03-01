package c_arrays.a_easy.d_removeDuplicatesFromArray;

import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 2, 2, 2, 3, 3};
        int ind = removeDup(arr);
        for(int i = 0; i<=ind; i++){
            System.out.print(arr[i] + " ");
        }
    }

    /*
    Attempt: 1
    Status: --
    Confidence: 6/10
    Date: 01-03-26
    */
    private static int removeDup(int[] arr) {
        if (arr.length == 0) return 0;

        ArrayList<Integer> temp = new ArrayList<>();
        int j = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[j]) {
                j++;
                arr[j] = arr[i];
            }
        }

        return j;
    }
}
