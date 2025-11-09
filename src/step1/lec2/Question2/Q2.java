package step1.lec2.Question2;

public class Q2{
    public static void main(String[] args){
        printPattern(6);
    }

    private static void printPattern(int n){
        for(int i=1;i<=n;i++){
            String star = "* ".repeat(i);
            System.out.println(star);
        }
    }
}