package a_basics.c_recursion.e_factorial;

public class solution {
    public static void main(String[] args){
        int N = 3;
        int result = factorial(N);
        System.out.print(result);
    }

    private static int factorial(int N){
        if(N==0) return 1;
        return N * factorial(--N);
    }
}
