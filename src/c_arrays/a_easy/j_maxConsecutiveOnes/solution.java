package c_arrays.a_easy.j_maxConsecutiveOnes;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        max(arr);
    }

    /*
    Attempt: 1
    Status: SOLVED
    Confidence: 7/10
    */
    private static void max(int[] arr) {
        int count = 0, max = 0;
        for (int j : arr) {
            if (j == 1) {
                max++;
            } else {
                max = 0;
            }
            count = Math.max(max, count);
        }
        System.out.println(count);
    }
}
