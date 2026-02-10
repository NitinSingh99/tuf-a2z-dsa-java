package step1.lec5.q7;

import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 4, 3, 2, 1};
//      ArrayList<Integer> result = revArrItr(arr);
//      int[] result = revArr(arr);
        revArrRec(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    //Brute Force - time: O(N), space: O(N)
    private static ArrayList<Integer> revArrItr(int[] arr) {
        ArrayList<Integer> res = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            res.add(arr[i]);
        }
        return res;
    }

    //Two Pointer - time: O(N), space: O(1)
    private static int[] revArr(int[] arr) {
        int p1 = 0;
        int p2 = arr.length - 1;
        while (p1 < p2) {
            int temp = arr[p2];
            arr[p2] = arr[p1];
            arr[p1] = temp;
            p1++;
            p2--;
        }
        return arr;
    }

    //Two Point recursive solution - time: O(N), space: O(N)
    private static void revArrRec(int[] arr, int left, int right) {
        if (left >= right) return;
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;

        revArrRec(arr, ++left, --right);
    }
}
