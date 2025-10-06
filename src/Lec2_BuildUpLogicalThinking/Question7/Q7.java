package Lec2_BuildUpLogicalThinking.Question7;

public class Q7 {
    public static void main(String[] args){
        printPattern(7);
    }

    private static void printPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int x=1; x<=2*i-1; x++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
