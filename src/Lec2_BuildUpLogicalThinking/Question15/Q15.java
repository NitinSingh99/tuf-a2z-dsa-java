package Lec2_BuildUpLogicalThinking.Question15;

public class Q15 {
    public static void main(String[] args){
        printPattern(6);
    }

    private static void printPattern(int N){
        for(int i=N; i>0; i--){
            char start = 'A';
            for(int j=0; j<i; j++){
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }
}
