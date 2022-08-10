public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");
//        method();

        long start = System.currentTimeMillis();

        System.out.println(factorial(5));
        System.out.println("5! = " + factorialUsingRecusion(5));

        long end = System.currentTimeMillis();

        System.out.println(end - start);

        method(1);
    }

    public static void method(int count) {
        count++;
        if (count <= 5) {
            System.out.println("Hello!");
            method(count);
        }
    }

    public static int factorial(int n) {
        int factorial = 1;
        if (n == 0) {
            return factorial;
        } else {
            for (int i = 1; i <= n; i++) {
                factorial = factorial * i;
            }
            return factorial;
        }
    }

    public static int factorialUsingRecusion(int n) {
        //Xác định điều kiện dừng
        if (n == 0) {
            return 1;
        }

        //Xác định công thức Đệ quy
        return n * factorialUsingRecusion(n-1);
    }

}
