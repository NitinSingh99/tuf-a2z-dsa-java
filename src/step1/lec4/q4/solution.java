package step1.lec4.q4;

public class solution {
    public static void main(String[] args) {
        int num1 = 5;
        int num2 = 20;

        int result = gcd_euclidean(num1, num2);
        System.out.print("GCD = " + result);
    }

    //Brute Force
    private static int gcd(int num1, int num2) {
        int smallestNum = Math.min(num1, num2);
        int gcd = 1;
        for (int i = 1; i <= smallestNum; i++) {
            if (num1 % i == 0 && num2 % i == 0) {
                gcd = i;
            }
        }

        return gcd;
    };

    //Better Solution
    private static int gcd_better(int num1, int num2) {
        for(int i = Math.min(num1, num2); i>0; i--){
            if (num1 % i == 0 && num2 % i == 0) {
                return i;
            }
        }
        return 1;
    };

    //Euclidean Algorithm - Optimal Solution
    private static int gcd_euclidean(int a, int b){
        int temp;
        while(b!=0){
            temp = b;
            b = a % b;
            a = temp;
        }

        return a;
    }
}
