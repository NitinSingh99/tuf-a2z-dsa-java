package Lec2_BuildUpLogicalThinking.Question17;

public class Q17 {
    public static void main(String[] args){
        printPattern(6);
    }

    private static void printPattern(int N){
        for(int i=1; i<=N; i++){
            char start = 'A';
            for(int j=N-i; j>0; j--){
                System.out.print(" ");
            }
            int breakpoint = i;
            for(int k=1; k<=i*2-1; k++){
                System.out.print(start);
                if(k<breakpoint) start++;
                else start--;
            }
            System.out.println();
        }
    }
}
