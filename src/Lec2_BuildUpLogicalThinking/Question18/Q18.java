package Lec2_BuildUpLogicalThinking.Question18;

public class Q18 {
    public static void main(String[] args){
        int N = 6;
        printPattern(N);
    }

    private static void printPattern(int N){

        for(int i=1; i<=N; i++){
            char start = (char) ('A' + N - 1);
            for(int j=1; j<=i; j++){
                System.out.print(start--);
            }
            System.out.println();
        }
    }
}
