package step1.lec2.Question12;

public class Q12 {
    public static void main(String[] args) {
        printPattern_rev(6);
    }

    private static void printPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = 1; k <= n * 2 - i * 2; k++) {
                System.out.print(" ");
            }

            for (int l = i; l > 0; l--) {
                System.out.print(l);
            }

            System.out.println();
        }
    }

    //Revisit 1 - X
    private static void printPattern_rev(int N) {
        int init = 1;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            for (int k = 1; k <= N * 2 - i * 2; k++) {
                System.out.print(" ");
            }

            for(int l=i; l>0; l--){
                System.out.print(l);
            }

            System.out.println();
        }
    }
}
