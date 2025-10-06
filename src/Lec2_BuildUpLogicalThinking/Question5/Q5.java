package Lec2_BuildUpLogicalThinking.Question5;

public class Q5 {
    public static void main(String[] args){
        printPattern(5);
    }

    private static void printPattern(int n){
        for(int i=n; i>0; i--){
            String stars = "* ".repeat(i);
            System.out.println(stars);
        }
    }
}
