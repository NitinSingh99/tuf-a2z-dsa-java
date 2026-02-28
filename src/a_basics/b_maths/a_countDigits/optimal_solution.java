package a_basics.b_maths.a_countDigits;

public class optimal_solution {
    public static void main(String[] args){
        int N = 232323;
        countDigits_rev(N);
    }

    private static void countDigits(int N){
        int cnt = (int) (Math.log10(N) + 1);
        System.out.println(cnt);
    }

    //Revisit 1 -- O
    private static void countDigits_rev(int N){
        int cnt = (int) (Math.log10(N) + 1);
        System.out.print(cnt);
    }
}
