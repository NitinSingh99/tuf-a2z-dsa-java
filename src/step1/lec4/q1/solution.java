package step1.lec4.q1;

public class solution {
    public static void  main(String[] args){
            int N = 12343223;
            countDigits(N);
    }

    private static void countDigits(int N){
        int digits = 0;
        while(N>0){
            N = N/10;
            digits++;
        }
        System.out.println(digits);
    }
}
