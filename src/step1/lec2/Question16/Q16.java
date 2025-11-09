package step1.lec2.Question16;

public class Q16 {
    public static void main(String[] args){
        printPattern(3);
    }

    private static void printPattern(int N){
        char start = 'A';
        for(int i=0; i<N; i++){
            for(int j=0; j<=i; j++){
                System.out.print(start + " ");
            }
            start++;
            System.out.println();
        }
    }
}
