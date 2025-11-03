package Lec2_BuildUpLogicalThinking.Question19;

public class Q19 {
    public static void main(String[] args){
        int N = 6;
        printPattern(N);
    }

    private static void printPattern(int N){
        for(int i=0; i<N; i++){
            for(int j=1; j<=N-i; j++){
                System.out.print("*");
            }

            for(int k=1; k<=2*i; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=N-i; j++){
                System.out.print("*");
            }

            System.out.println();

        }

        for(int i=N-1; i>=0; i--){
            for(int j=1; j<=N-i; j++){
                System.out.print("*");
            }

            for(int k=1; k<=2*i; k++){
                System.out.print(" ");
            }

            for(int j=1; j<=N-i; j++){
                System.out.print("*");
            }

            System.out.println();

        }
    }
}
