package step1.lec2.Question14;

public class Q14 {
    public static void main(String[] args) {
        printPattern_rev(3);
    }

    private static void printPattern(int N) {

        for (int i = 0; i < N; i++) {
            char start = 'A';
            for (int j = 0; j <= i; j++) {
                System.out.print(start++ + " ");
            }
            System.out.println();
        }
    }

    //Revision 1
    private static void printPattern_rev(int N) {

        for (int i = 1; i <= N; i++) {
            char init = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(init++);
            }
            System.out.println();
        }
    }
}
