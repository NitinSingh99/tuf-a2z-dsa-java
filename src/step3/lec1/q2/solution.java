package step3.lec1.q2;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, 7, 7, 5};
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
}
