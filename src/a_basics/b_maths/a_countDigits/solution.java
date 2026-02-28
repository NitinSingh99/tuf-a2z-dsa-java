package a_basics.b_maths.a_countDigits;

public class solution {
    public static void  main(String[] args){
            int N = 12343223;
        countDigits_rev(N);
    }

    private static void countDigits(int N){
        int digits = 0;
        while(N>0){
            N = N/10;
            digits++;
        }
        System.out.println(digits);
    }

    //Revisit 1 -- O
    private static void countDigits_rev(int N){
        int digit=0;
        while(N>0){
            N = N/10;
            digit++;
        }
        System.out.print(digit);
    }
}
