package step3.lec1.q1;

public class solution {
    public static void main(String[] args) {
        int[] arr = {8, 10, 5, 7, 9};
        int max = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.print(max);
    }
}
