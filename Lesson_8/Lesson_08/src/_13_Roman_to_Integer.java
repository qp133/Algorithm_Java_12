import java.util.Arrays;

public class _13_Roman_to_Integer {
    public static int romanToInt(String s) {
        int sum = 0;
        int[] arr = stringToArray(s);
        for (int i = arr.length-1; i >= 0 ; i--) {
            if (i-1 >= 0 && arr[i] > arr[i-1]) {
                sum += arr[i] - arr[i-1];
                i--;
            } else {
                sum += arr[i];
            }
        }
        return sum;
    }

    public static int[] stringToArray(String s) {
        int[] array = new int[s.length()];

        for (int i = 0; i < array.length; i++) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    array[i] = 1;
                    break;
                case 'V':
                    array[i] = 5;
                    break;
                case 'X':
                    array[i] = 10;
                    break;
                case 'L':
                    array[i] = 50;
                    break;
                case 'C':
                    array[i] = 100;
                    break;
                case 'D':
                    array[i] = 500;
                    break;
                case 'M':
                    array[i] = 1000;
                    break;
            }
        }
        return array;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";

//        int[] arr = stringToArray(s);
//        System.out.println(Arrays.toString(arr));

//        System.out.println(romanToInt(s));

        System.out.println(romanToInt1(s));
    }

    public static int romanToInt1(String s) {
        int sum = 0;
        for (int i = s.length()-1; i >= 0 ; i--) {
            char ch = s.charAt(i);
            switch (ch) {
                case 'I':
                    if (sum > 4) {
                        sum = sum - 1;
                    } else {
                        sum += 1;
                    }
                    break;
                case 'V':
                    sum += 5;
                    break;
                case 'X':
                    if (sum > 40) {
                        sum -= 10;
                    } else {
                        sum += 10;
                    }
                    break;
                case 'L':
                    sum += 50;
                    break;
                case 'C':
                    if (sum > 400) {
                        sum = sum -100;
                    } else {
                        sum = sum + 100;
                    }
                    break;
                case 'D':
                    sum = sum + 500;
                    break;
                case 'M':
                    sum = sum + 1000;
                    break;
            }
        }
        return sum;
    }
}
