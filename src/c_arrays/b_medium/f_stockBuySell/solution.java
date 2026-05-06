package c_arrays.b_medium.f_stockBuySell;

public class solution {
    public static void main(String[] args) {
        int[] arr = {7, 1, 5, 3, 6, 4};
        buySell_rev(arr);
    }

    private static void buySell(int[] arr) {
        int min = Integer.MAX_VALUE;
        int profit = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            } else {
                profit = Math.max(profit, arr[i] - min);
            }
        }
        System.out.println(profit);
    }

    private static void buySell_rev(int[] arr) {
        int buy = arr[0];
        int max = 0;
        for (int i = 1; i < arr.length; i++) {

            if(arr[i] < buy){
                buy = arr[i];
            }else{
                max = Math.max(max, arr[i] - buy);
            }
        }
        System.out.println(max);
    }
}
