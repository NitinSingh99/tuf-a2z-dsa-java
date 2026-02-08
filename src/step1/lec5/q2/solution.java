package step1.lec5.q2;

public class solution {
    public static void main(String[] args){
        String toPrint = "Nitin";
        int num = 3;
        printName(toPrint, num);
    }

    private static void printName(String print, int N){
        if(N==0){
            return;
        }
        System.out.print(print + " ");
        N--;
        printName(print, N);
    }
}
