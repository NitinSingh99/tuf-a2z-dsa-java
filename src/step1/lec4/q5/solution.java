package step1.lec4.q5;

public class solution {
    public static void main(String[] args){
        int N = 371;
        boolean result = check(N);
        System.out.print(result);
    }

    private static boolean check(int N){
        int k = String.valueOf(N).length();
        int n = N;
        int sum =0;

        while(n>0){
            int ld = n%10;
            n=n/10;
            sum += (int) Math.pow(ld, k);
        }

        return sum == N;
    }

}
