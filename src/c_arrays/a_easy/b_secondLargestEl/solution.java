package c_arrays.a_easy.b_secondLargestEl;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
        sLargest3(arr);
    }
    /*
    Attempt: 1
    Status: FAILED
    Confidence: 6/10
    */
    private static void sLargest(int[] arr){
        int small = Integer.MAX_VALUE;
        int second_small = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int second_large = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<second_small && arr[i] != small){
                second_small = arr[i];
            }

            if(arr[i]>second_large && arr[i] != large){
                second_large = arr[i];
            }
        }

        System.out.println("Small:" + small);
        System.out.println("large:" + large);
        System.out.println("second_small:" + second_small);
        System.out.println("second_large:" + second_large);
    }

    /*
    Attempt: 2
    Status: FAILED
    Confidence: 7/10
    */
    private static void sLargest2(int[] arr){
        int small = Integer.MAX_VALUE;
        int sSmall = Integer.MAX_VALUE;
        int large = Integer.MIN_VALUE;
        int sLarge = Integer.MIN_VALUE;

        for(int i = 0; i<arr.length; i++){
            small = Math.min(small, arr[i]);
            large = Math.max(large, arr[i]);
        }

        for(int i = 0; i<arr.length; i++){
            if(arr[i]<sSmall && arr[i] != small){
                sSmall = arr[i];
            }

            if(arr[i]>sLarge && arr[i] != large){
                sLarge = arr[i];
            }
        }

        System.out.println(sSmall);
        System.out.println(sLarge);
    }

    /*
    Attempt: 3
    Status: SOLVED
    Confidence: 8/10
    */
    private static void sLargest3(int[] arr){
        int max = Integer.MIN_VALUE, sMax = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE, sMin = Integer.MAX_VALUE;
        for(int i : arr){
            max = Math.max(max, i);
            min = Math.min(min, i);
        }

        for(int j: arr){
            if (j != max) {
                sMax = Math.max(sMax, j);
            }
            if(j!=min){
                sMin = Math.min(sMin, j);
            }
        }
        System.out.println(sMax);
        System.out.println(sMin);
    }
}
