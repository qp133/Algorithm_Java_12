public class _12_Integer_to_Roman {
    public static String intToRoman(int num) {
        String[] strArray = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int[] intArray = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};

        StringBuilder sb = new StringBuilder();
        int n = strArray.length;

        for (int i = 0; i < n; i++) {
            while (num >= intArray[i]) {
                sb.append(strArray[i]);
                num = num - intArray[i];
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int num = 31;
        System.out.println(intToRoman(num));
    }
}
