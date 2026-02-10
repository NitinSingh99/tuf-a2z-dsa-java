package step1.lec5.q5;

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
