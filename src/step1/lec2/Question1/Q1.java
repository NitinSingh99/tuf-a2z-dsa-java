package step1.lec2.Question1;

public class Q1 {
    public static void main(String[] args) {
        printPattern(3);
    }

    private static void printPattern(int n){
        String stars = "* ".repeat(n);
        for(int i=0; i<n; i++){
            System.out.println(stars);
        }
    }
}
