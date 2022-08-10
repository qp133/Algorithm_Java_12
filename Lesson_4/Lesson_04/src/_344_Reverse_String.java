public class _344_Reverse_String {
    public void reverseString(char[] s) {
        reverseString(s, 0, s.length-1);
    }

    public void reverseString(char[] s, int i, int j) {
        if (j <= i) {
            return;
        }

        char temp = s[i];
        s[i] = s[j];
        s[j] = temp;

        reverseString(s, i+1, j-1);
    }

    public static void main(String[] args) {
        char[] s = {'h', 'e', 'l', 'l', 'o'};
    }
}
