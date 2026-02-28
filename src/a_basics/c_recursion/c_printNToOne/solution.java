package a_basics.c_recursion.c_printNToOne;

public class solution {
    public static void main(String[] args){
    int N = 5;
    printN(N);
    }

    private static void printN(int N){
        if(N==0) return;
        System.out.print(N + " ");
        printN(--N);
    }
}
