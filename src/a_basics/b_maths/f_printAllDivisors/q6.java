package a_basics.b_maths.f_printAllDivisors;

import java.util.ArrayList;
import java.util.List;

public class q6 {
    public static void main(String[] args) {
        int N = 12;
        List<Integer> result = getDivisors_rev(N);
        System.out.print(result);
    }

    private static List<Integer> getDivisors(int N) {
        List<Integer> resultArray = new ArrayList<>();

        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                resultArray.add(i);
                if (i != N / i) {
                    resultArray.add(N / i);
                }
            }
        }
        return resultArray;
    }

    //Revisit 1 -- O
    private static List<Integer> getDivisors_rev(int N) {
        ArrayList<Integer> res = new ArrayList<>();

        for(int i=1; i*i<=N; i++){
            if(N%i == 0){
                res.add(i);
                int x = N/i;
                if(x != i){
                    res.add(x);
                }
            }
        }
        return res;
    }
}
