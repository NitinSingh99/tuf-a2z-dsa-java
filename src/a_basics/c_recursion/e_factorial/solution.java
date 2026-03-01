package a_basics.c_recursion.e_factorial;

public class solution {
    public static void main(String[] args) {
        int N = 3;
        int result = factorial2(N);
        System.out.print(result);
    }

    private static int factorial(int N) {
        if (N == 0) return 1;
        return N * factorial(--N);
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 9/10
    */
    private static int factorial2(int N) {
        if (N <= 1) return 1;
        return N * factorial2(N-1);
    }
}
