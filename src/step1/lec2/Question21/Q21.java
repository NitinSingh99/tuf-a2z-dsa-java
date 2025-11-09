package step1.lec2.Question21;

public class Q21 {
    public static void main(String[] args){
        int N = 4;
        printPattern(N);
    }

//    Solution 1
//    private static void printPattern(int N){
//        for(int i=1; i<=N; i++){
//            if(i==1 || i==N){
//                for(int j=1; j<=N; j++){
//                    System.out.print("*");
//                }
//            }else{
//                System.out.print("*");
//                for(int k=1; k<=N-2; k++){
//                    System.out.print(" ");
//                }
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }

//    Clean Solution
        private static void printPattern(int N){
            for(int i=0; i<N; i++){
                    for(int j=0; j<N; j++){
                        if(i==0 || j==0 || i==N-1 || j==N-1) System.out.print("*");
                        else System.out.print(" ");

                    }
                    System.out.println();
            }
        }
}
