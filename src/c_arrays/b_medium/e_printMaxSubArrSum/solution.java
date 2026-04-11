package c_arrays.b_medium.e_printMaxSubArrSum;

public class solution {
    public static void main(String[] args) {
        int[] arr = {2, 1, -1, -4, 1, 4, -2};
//        int[] arr = {2, 3, -7, 4, 7, -4};
        maxSubArray_rev(arr);
    }

    public static void maxSubarray(int[] nums) {
        int sum = nums[0], max = nums[0];
        int tempStart = 0, start = 0, end = 0;
        for (int i = 1; i < nums.length; i++) {
            if(nums[i] > sum + nums[i]){
                sum = nums[i];
                tempStart = i;
            }else{
                sum += nums[i];
            }

            if(sum>max){
                max = sum;
                start = tempStart;
                end = i;
            }
        }

        System.out.println("max :" + max);
        for(int i = start; i<=end; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void maxSubArray_rev(int[] nums){
        int start = 0, end = 0, tempStart = 0;
        int sum = nums[0], max = nums[0];
        for(int i = 1; i<nums.length; i++){
            if(nums[i] > sum + nums[i]){
                sum = nums[i];
                tempStart = i;
            }else{
                sum += nums[i];
            }

            if(sum>max){
                max = sum;
                start = tempStart;
                end = i;
            }
        }
        System.out.println("max: " + max);
        for(int i = start; i<=end; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
