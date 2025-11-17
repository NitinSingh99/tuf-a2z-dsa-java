package step1.lec4.q2;

public class solution {
    public static void main(String[] args){
        int N = 569600;
        reverse(N);
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
}
