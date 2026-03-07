package c_arrays.a_easy.c_checkArraySorted;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        boolean res = check2(arr);
        System.out.println(res);
    }

    /*
    Attempt: 1
    Status: SOLVED
    Confidence: 9/10
    Date: 01-03-26
    */
    private static boolean check(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < arr[i - 1]) {
                return false;
            }
        }
        return true;
    }

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 9/10
    Date: 07-03-26
    */
    private static boolean check2(int[] arr){
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }
}
