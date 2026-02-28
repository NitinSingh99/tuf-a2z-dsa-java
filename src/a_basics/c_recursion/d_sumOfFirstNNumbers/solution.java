package a_basics.c_recursion.d_sumOfFirstNNumbers;

public class solution {
    public static void main(String[] args){
        int N = 2;
       int sum = add(N);
       System.out.print(sum);
    }

    private static int add(int N){
        if(N==1) return 1;
        int sum = N + add(--N);
        return sum;
    }
}
