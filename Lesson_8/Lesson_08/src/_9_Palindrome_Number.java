public class _9_Palindrome_Number {
    public static boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }

        int reverse = 0;
        while (x != 0) {
            int i = x % 10;
            reverse = reverse * 10 + i;
            x = x / 10;
        }
        return x == reverse;
    }

    public static void main(String[] args) {
        int x = 1221;
        System.out.println(isPalindrome(x));
    }
}

