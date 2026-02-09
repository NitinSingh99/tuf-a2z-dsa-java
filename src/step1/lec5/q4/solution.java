package step1.lec5.q4;

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
