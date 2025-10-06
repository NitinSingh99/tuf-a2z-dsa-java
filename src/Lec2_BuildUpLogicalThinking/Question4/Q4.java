package Lec2_BuildUpLogicalThinking.Question4;

public class Q4 {
    public static void main(String[] args){
        printPattern(5);
    }

    private static void printPattern(int n){
        for(int i=1; i<=n; i++){
            String no = Integer.toString(i).repeat(i);
            System.out.println(no);
        }
    }
}
