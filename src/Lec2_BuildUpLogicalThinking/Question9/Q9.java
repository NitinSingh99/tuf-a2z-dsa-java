package Lec2_BuildUpLogicalThinking.Question9;

public class Q9 {
    public static void main(String[] args){
        printPattern(5);
    }

    public static void printPattern(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n-i; j++){
                System.out.print(" ");
            }

            for(int k=1; k<=2*i-1; k++){
                System.out.print("*");
            }

            System.out.println();
        }

        for(int l=n; l>0; l--){
            for(int m=n-l; m>0; m--){
                System.out.print(" ");
            }

            for(int o=2*l-1; o>0; o--){
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
