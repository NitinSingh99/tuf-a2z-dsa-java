package a_basics.b_maths.e_armstrongNubmer;

public class solution {
    public static void main(String[] args){
        int N = 153;
        boolean result = check_rev(N);
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

    //Revisit 1 -- O
    private static boolean check_rev(int n){
        int digits = (int) (Math.log10(n) + 1);
        int no = n;
        int armNo = 0;
        while(no>0){
            int ld = no%10;
            armNo = (int) (armNo + Math.pow(ld, digits));
            no = no/10;
        }

        return n == armNo;
    }

}
