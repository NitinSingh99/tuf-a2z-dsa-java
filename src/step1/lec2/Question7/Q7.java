package step1.lec2.Question7;

public class Q7 {
    public static void main(String[] args){
        printPattern_rev(7);
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

    //Revision - X
    private static void printPattern_rev(int N){
        for(int i=1; i<=N; i++){
            for(int j=1; j<= N-i; j++){
                System.out.print(" ");
            }

            for(int k = 1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
