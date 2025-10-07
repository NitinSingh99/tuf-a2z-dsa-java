package Lec2_BuildUpLogicalThinking.Question11;

public class Q11 {
    public static void main(String[] args){
        printPatter(6);
    }

    private static void printPatter(int n){
        int start = 1;

        for(int i=0; i<n; i++){

            if(i%2==0) start = 1;
            else start = 0;

            for(int j=0; j<=i; j++){
                System.out.print(start);
                start = 1-start;
            }

            System.out.println();
        }
    }
}
