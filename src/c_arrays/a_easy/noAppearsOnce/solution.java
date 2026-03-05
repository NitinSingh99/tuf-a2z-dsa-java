package c_arrays.a_easy.noAppearsOnce;
import java.util.Map;
import java.util.HashMap;
public class solution {
    public static void main(String[] args){
        int[] nums = {4,1,2,1,2};
        find(nums);
    }

    //My solution
    private static void find(int[] nums){
        Map<Integer, Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i, map.getOrDefault(i, 0) + 1);
        }
        for(Map.Entry<Integer, Integer> entry: map.entrySet()){
            if(entry.getValue() == 1 ){
                System.out.println(entry.getKey());
            }
        }
    }
}
