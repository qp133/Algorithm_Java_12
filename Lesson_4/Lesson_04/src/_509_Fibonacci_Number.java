public class _509_Fibonacci_Number {
    public static int fib(int n) {
        int f0 = 0;
        int f1 = 1;
        int fn = 1;
        if (n == 0 || n == 1) {
            return n;
        } else {
            for (int i = 2; i < n; i++) {
                f0 = f1;
                f1 = fn;
                fn = f0 + f1;
            }
        }
        return fn;
    }

    public static int fibUsingRecusion(int n) {
        //Điều kiện dừng
        if (n == 0 || n == 1) {
            return n;
        } else {
            //Công thức đệ quy
            return fibUsingRecusion(n-1) + fibUsingRecusion(n-2);
        }
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fib(n));
    }
}
