package c_arrays.b_medium.d_maxSubArrSum;

public class solution {
    public static void main(String[] args) {
        int[] arr = {-2, -3, -7, -2, -10, -4};
        maxSum(arr);
    }

    private static void maxSum(int[] arr) {
        int sum = 0, max = Integer.MIN_VALUE;
        for (int num : arr) {
            sum += num;
            max = Math.max(max, sum);
            if (sum < 0) {
                sum = 0;
            }
        }

        System.out.println(max);
    }
}
