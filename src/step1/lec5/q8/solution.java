package step1.lec5.q8;

public class solution {
    public static void main(String[] args) {
        String str = "NITIN";
        boolean res = checkPalindrome(0, str);
        System.out.print(res);
    }

    private static boolean checkPalindrome(int i, String str) {
        if (i >= str.length() / 2) return true;
        if (str.charAt(i) != str.charAt(str.length() - i - 1)) return false;

        return checkPalindrome(++i, str);
    }
}
