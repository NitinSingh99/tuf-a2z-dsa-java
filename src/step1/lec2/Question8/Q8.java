package step1.lec2.Question8;

public class Q8 {
    public static void main(String[] args){
        printPattern(6);
    }

    public static void printPattern(int n){
        for(int i=n; i>0; i--){
            for(int j=n-i; j>0; j--){
                System.out.print(" ");
            }

            for(int k=2*i-1; k>0; k--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
