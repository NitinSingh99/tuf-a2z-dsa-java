package c_arrays.a_easy.j_maxConsecutiveOnes;

public class solution {
    public static void main(String[] args) {
        int[] arr = {1, 1, 0, 1, 1, 1};
        max_rev(arr);
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

    /*
    Attempt: 2
    Status: SOLVED
    Confidence: 8/10
    */
    private static void max_rev(int[] arr) {
        int cnt = 0;
        int max = 0;
        for (int j : arr) {
            if (j == 1) {
                cnt++;
            } else {
                cnt = 0;
            }
            max = Math.max(max, cnt);
        }

        System.out.println(max);
    }
}
