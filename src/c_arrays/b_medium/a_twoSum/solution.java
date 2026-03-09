package c_arrays.b_medium.a_twoSum;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args){
        int[] arr = {2,6,5,8,11};
        int target = 14;
        towSum_opt(arr, target);
    }

    //Brute force
    private static void twoSum(int[] arr, int target){
        boolean flag = false;
        int x = 0, y = 0;
        for(int i = 0; i<arr.length; i++){
            for(int j = 0; j<arr.length; j++){
                if(arr[i] + arr[j] == target && i!=j){
                    x = arr[j];
                    y = j;
                    flag = true;
                    break;
                }
            }
            if(flag){
                System.out.println(arr[i] + " and " + x);
                System.out.println("indexes: " + i + " , " + y);
                break;
            }
        }
    }

    //Optimal Solution
    private static void towSum_opt(int[] arr, int target){
        Map<Integer, Integer> map = new HashMap<>();
        int x = 0, y = 0;
        boolean flag = false;
        for(int i = 0; i<arr.length; i++){
            int complement = target - arr[i];
            if(map.containsKey(complement)){
                System.out.println("Yes");
                flag = true;
                x = map.get(complement);
                y = i;
                break;
            }
            map.put(arr[i], i);
        }

        if(flag) System.out.println("indexes: " + x + " , " + y);
    }
}
