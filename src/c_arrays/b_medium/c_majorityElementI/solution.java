package c_arrays.b_medium.c_majorityElementI;

import java.util.HashMap;
import java.util.Map;

public class solution {
    public static void main(String[] args){
        int[] arr = {7, 0, 0, 1, 7, 7, 2, 7, 7};
        majority_opt(arr);
    }

    private static void majority(int[] arr){
        Map<Integer, Integer> map = new HashMap<>();

        for(int i = 0; i<arr.length; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = 0;
        int val = 0;
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() > max){
                max = entry.getValue();
                val = entry.getKey();
            }
        }
        System.out.println(val);

    }

    //Optimal Solution
    private static void majority_opt(int[] arr){
        int count = 0;
        int crn = 0;
        for(int i = 0; i<arr.length; i++){
            if(count == 0){
                crn = arr[i];
                count++;
            }

            if(arr[i] == crn){
                count++;
            }else{
                count --;
            }
        }

        System.out.println(crn);
    }
}
