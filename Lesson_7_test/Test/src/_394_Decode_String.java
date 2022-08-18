public class _394_Decode_String {
    public String decodeString(String s) {
        int key = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                key = Integer.parseInt(String.valueOf(i));
            } else if (s.charAt(i) == '[') {
                int count = 1;
                int j = i;
                while (count > 0) {
                    j++;
                } if (s.charAt(j) == '[') {
                    count++;
                } if (s.charAt(j) == ']') {
                    count++;
                }
            }
        }
        return null;
    }
}
