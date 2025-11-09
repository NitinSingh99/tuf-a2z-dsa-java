package step1.lec2.Question6;

public class Q6 {
    public static  void main(String[] args){
        printPattern(5);
    }

    private static void printPattern(int n){
        for(int i=n; i>0; i--){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
}
