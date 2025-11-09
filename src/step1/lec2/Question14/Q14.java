package step1.lec2.Question14;

public class Q14 {
    public static void main(String[] args){
        printPattern(3);
    }

    private static void printPattern(int N){

         for(int i=0; i<N; i++){
             char start = 'A';
             for(int j=0; j<=i; j++){
                 System.out.print(start++ + " ");
             }
             System.out.println();
         }
    }
}
