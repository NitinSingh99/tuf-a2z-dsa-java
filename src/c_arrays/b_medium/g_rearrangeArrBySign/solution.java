package c_arrays.b_medium.g_rearrangeArrBySign;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, -1, -2, -3};
        arrange(arr);
    }

    //my solution works but is fragile fails for edge cases like when arr = {1, 2, 3, -1, -2, -3}
    private static void arrange(int[] arr) {
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[j+1] > 0 && arr[j] > 0){
                if(arr[i] < 0){
                    int temp = arr[j+1];
                    arr[j+1] = arr[i];
                    arr[i] = temp;
                    j = i;
                }
            }else if(arr[j+1] < 0 && arr[j] < 0){
                if(arr[i] > 0){
                    int temp = arr[j+1];
                    arr[j+1] = arr[i];
                    arr[i] = temp;
                    j = i;
                }
            }else{
                j++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }

//    private static void rearrange(int[] arr){
//        int n = arr.length;
//
//    }
}
