package a_basics.c_recursion.b_printOneToN;

public class solution {
    public static void main(String[] args){
        int N=5;
        print(1, N);
    }

    private static void print(int i, int N){
        if(i>N) return;
        System.out.print(i + " ");
        print(++i, N);
    }
}
