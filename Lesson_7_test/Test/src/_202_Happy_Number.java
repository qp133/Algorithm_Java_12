public class _202_Happy_Number {
    public static boolean isHappy(int n) {
        if (n == 1 || n == 7) {
            return true;
        } else if(n < 7) {
            return false;
        } else {
            int sum = 0;
            while (n > 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }
            return isHappy(sum);
        }

    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(isHappy(n));
    }
}
