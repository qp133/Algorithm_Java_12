public class _202_Happy_Number {
//    public static boolean isHappy(int n) {
//        if (n == 1 || n == 7) {
//            return true;
//        } else if(n < 7) {
//            return false;
//        } else {
//            int sum = 0;
//            while (n > 0) {
//                sum += (n % 10) * (n % 10);
//                n = n / 10;
//            }
//            return isHappy(sum);
//        }
//    }

    public static boolean isHappy(int n) {
        while (n >= 10) {
            int temp = n;
            n = 0;

            while (temp != 0) {
                n += Math.pow((temp%10), 2);
                temp = temp / 10;
            }
        }
        return n == 1 || n == 7;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(isHappy(n));
    }
}
