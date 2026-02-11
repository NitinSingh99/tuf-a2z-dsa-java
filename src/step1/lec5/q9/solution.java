package step1.lec5.q9;

import java.util.Arrays;

public class solution {
    public static void main(String[] args) {
        int N = 5;
//        printFib(N);
        Fib(N);
    }

    //Brute Force
    private static void printFib(int N) {
        if (N == 0) {
            System.out.print(0);
        } else if (N == 1) {
            System.out.print("0 1");
        } else {
            int[] fib = new int[N + 1];
            fib[0] = 0;
            fib[1] = 1;
            for (int i = 2; i <= N; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }
            System.out.print(Arrays.toString(fib));
        }
    }

    //Better Sliding Window Approach
    private static void Fib(int N){
        int last = 0;
        int slast = 1;
        int cur;
        System.out.print("0 1 ");
        for(int i=2; i<=N; i++){
            cur = last + slast;
            last = slast;
            slast = cur;
            System.out.print(cur + " ");
        }
    }

}
