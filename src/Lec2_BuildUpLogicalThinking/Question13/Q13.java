package Lec2_BuildUpLogicalThinking.Question13;

public class Q13 {
    public static void main(String[] args){
        printPattern(6);
    }

    private static void printPattern(int N){
        int number = 1;
        for(int i=1; i<=N; i++){
            for(int j=1; j<=i; j++){
                System.out.print(number++ + " ");
            }
            System.out.println();
        }
    }
}
