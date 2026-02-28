package a_basics.b_maths.c_palindromeNumber;

public class solution {
    public static void main(String[] args){
        int N = 123321;
        checkPalindrome_rev(N);
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


    // Revisit 1 -- O
    private static void checkPalindrome_rev(int N){
        int reversed = 0;
        int no = N;

        while(no>0){
            int ld = no%10;
            reversed = (reversed*10) + ld;
            no = no/10;
        }

        System.out.println(reversed == N);
    }
}
