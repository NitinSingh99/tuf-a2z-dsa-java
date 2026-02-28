package a_basics.b_maths.b_reverseNumber;

public class solution {
    public static void main(String[] args){
        int N = 569600;
        reverse_rev(N);
    }

    private static void reverse(int N){
        int answer=0;
        int ld;
        while(N>0){
            ld = N%10;
            answer = answer*10 + ld;
            N = N/10;
        }
        System.out.println(answer);
    }

    private static void reverse_rev(int N){
        int ans = 0;
        int lastDig;
        while(N>0){
            lastDig = N%10;
            ans = (ans*10)+lastDig;
            N= N/10;
        }
        System.out.println(ans);
    }
}
