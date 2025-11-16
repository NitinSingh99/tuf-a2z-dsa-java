package step1.lec4.q1;

public class optimal_solution {
    public static void main(String[] args){
        int N = 232323;
        countDigits(N);
    }

    private static void countDigits(int N){
        int cnt = (int) (Math.log10(N) + 1);
        System.out.println(cnt);
    }
}
