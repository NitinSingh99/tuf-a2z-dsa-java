package step1.lec4.q3;

public class solution {
    public static void main(String[] args){
        int N = 122322178;
        checkPalindrome(N);
    }

    private static void checkPalindrome(int N){
        int reversed = reverse(N);
        if(N==reversed){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }

    private static int reverse(int N){
        int newNumber = 0;
        int ld;
        while(N>0){
            ld = N%10;
            newNumber = newNumber*10 + ld;
            N = N/10;
        }

        return newNumber;
    }
}
