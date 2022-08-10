public class _1295_FindNumbersWithEvenNumberOfDigits {
    public static void main(String[] args) {
        int x = 7896;
        System.out.println(countDigit(x));
    }

    public static int countDigit(int number) {
        int count = 0;
        while (number != 0) {
            number = number / 10;
            count++;
        }
        return count;

        //Cách 2
//        String s = String.valueOf(number);
//        return s.length();
    }

    public static int findNumbers(int[] nums) {
        int count = 0;
        for (int i : nums) {
            if (countDigit(i) % 2 == 0) {
                count++;
            }
        }
        return count;
    }
}
