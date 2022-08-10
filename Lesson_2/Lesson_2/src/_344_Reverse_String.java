public class _344_Reverse_String {
    public static void reverseString(char[] s) {
//        int i = 0;
//        int j = s.length-1;
//        char m;
//        while (j > i) {
//            m = s[j];
//            s[j] = s[i];
//            s[i] = m;
//            j--;
//            i++;
//        }

        //Cách 2
        for (int i = 0; i < s.length/2; i++) {
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
        }
    }

    public static void main(String[] args) {
    }
}
