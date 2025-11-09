package step1.lec2.Question20;

public class Q20 {
    public static void main(String[] args){
        int N = 6;
        printPattern(N);
    }

    private static void printPattern(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int k=1; k<=N*2-2*i; k++){
                System.out.print(" ");
            }

            for(int l=1; l<=i; l++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int i=N-1; i>=0; i--){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            for(int k=1; k<=N*2-2*i; k++){
                System.out.print(" ");
            }

            for(int l=1; l<=i; l++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
