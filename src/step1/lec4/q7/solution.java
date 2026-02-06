package step1.lec4.q7;

public class solution {
    public static void main(String[] args) {
        int N = 170;
        boolean result = checkPrime_optimal(N);
        System.out.print(result);
    }

    //Brute force
    private static boolean checkPrime(int N) {
        int cnt = 0;
        for (int i = 1; i <= N; i++) {
            if (N % i == 0) {
                cnt++;
            }
        }
        return cnt == 2;
    }

    //    Optimal Solution
    private static boolean checkPrime_optimal(int N) {
        int cnt = 0;
        for (int i = 1; i * i <= N; i++) {
            if (N % i == 0) {
                cnt++;
                if (i != N / i) {
                    cnt++;
                }
            }
        }
        return cnt == 2;
    }
}


