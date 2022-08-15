public class HW_50_Pow_x_n {
    public static double myPow(double x, int n) {
        if(n < 0){
            n *= -1;
            x = 1/x;
        }

        return myPowRecursion(x, n);
    }

    private static double myPowRecursion(double x, int n){

        if(n == 0){
            return 1;
        }else if(n == 1){
            return x;
        }

        double a = myPowRecursion(x, n/2);

        if(n%2 == 0){
            return a * a;
        }else{
            return a * a * x;
        }
    }

    public static void main(String[] args) {
        System.out.println(myPow(2,5));
    }
}
