package step1.lec4.q6;

import java.util.ArrayList;
import java.util.List;

public class q6 {
    public static void main(String[] args){
        int N = 12;
        List<Integer> result = getDivisors(N);
        System.out.print(result);
    }

    private static List<Integer> getDivisors(int N){
        List<Integer> resultArray = new ArrayList<>();

        for(int i=1; i*i<=N; i++){
            if(N%i==0){
                resultArray.add(i);
                if(i != N/i){
                    resultArray.add(N/i);
                }
            }
        }
        return resultArray;
    }
}
