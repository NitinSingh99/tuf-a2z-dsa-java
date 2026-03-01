package b_sorting.d_mergeSort;

import java.util.ArrayList;
import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {5, 2, 8, 4, 1};
        mergeSort2(arr, 0, arr.length - 1);
        System.out.print(Arrays.toString(arr));
    }

    /*
    Attempt: 1
    Status: FAILED
    Confidence: 5/10
    */
    private static void mergeSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);
        merge(arr, low, mid, high);
    }

    private static void merge(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            } else {
                temp.add(arr[right++]);
            }
        }

        while (left <= mid) {
            temp.add(arr[left++]);
        }

        while (right <= high) {
            temp.add(arr[right++]);
        }

        for (int i = low; i <= high; i++) {
            arr[i] = temp.get(i - low);
        }
    }

    /*
    Attempt: 2
    Status: FAILED
    Confidence: 6/10
    */
    private static void mergeSort2(int[] arr, int low, int high) {
        if (low >= high) return;
        int mid = (low + high) / 2;
        mergeSort2(arr, low, mid);
        mergeSort2(arr, mid + 1, high);
        merge2(arr, low, mid, high);
    }

    private static void merge2(int[] arr, int low, int mid, int high) {
        int left = low;
        int right = mid + 1;
        ArrayList<Integer> temp = new ArrayList<>();
        while (left <= mid && right <= high) {
            if (arr[left] <= arr[right]) {
                temp.add(arr[left++]);
            }else{
                temp.add(arr[right++]);
            }
        }

        while(left<=mid){
            temp.add(arr[left++]);
        }

        while(right<=high){
            temp.add(arr[right++]);
        }

        for(int i = low; i<=high; i++){
            arr[i] = temp.get(i-low);
        }
    }
}
