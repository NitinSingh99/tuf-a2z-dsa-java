package b_sorting.g_quickSort;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {4, 1, 7, 9, 3};
        quickSort2(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    /*
    Attempt: 1
    Status: FAILED
    Confidence: 6/10
    Date: 01-03-26
    */
    private static void quickSort(int[] arr, int low, int high) {
        if (low >= high) return;
        int partitionInd = partition(arr, low, high);
        quickSort(arr, low, partitionInd - 1);
        quickSort(arr, partitionInd + 1, high);
    }

    private static int partition(int[] arr, int low, int high) {
        int pivot = arr[low];
        int i = low;
        int j = high;

        while (i < j) {
            while (arr[i] <= pivot && i <= high - 1) {
                i++;
            }

            while (arr[j] > pivot && j >= low + 1) {
                j--;
            }

            if (i < j) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 7/10
    Date: 01-03-26
    */
    private static void quickSort2(int[] arr, int low, int high) {
        if (low >= high) return;
        int pInd = partition2(arr, low, high);
        quickSort2(arr, low, pInd-1);
        quickSort2(arr, pInd+1, high);
    }

    private static int partition2(int[] arr, int low, int high){
        int pivot = arr[low];
        int i = low;
        int j = high;

        while(i<j){
            while(arr[i]<=pivot && i<=high-1){
                i++;
            }

            while(arr[j]>pivot && j>=low+1){
                j--;
            }

            if(i<j){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[low];
        arr[low] = arr[j];
        arr[j] = temp;

        return j;
    }
}
