public class _13_Roman_to_Integer {
    public static int romanToInt(String s) {
        int n = s.length();
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            switch(s.charAt(i)) {
                case 'I':
                    nums[i] = 1;
                    break;
                case 'V':
                    nums[i] = 5;
                    break;
                case 'X':
                    nums[i] = 10;
                    break;
                case 'L':
                    nums[i] = 50;
                    break;
                case 'C':
                    nums[i] = 100;
                    break;
                case 'D':
                    nums[i] = 500;
                    break;
                case 'M':
                    nums[i] = 1000;
                    break;
            }
        }
        int sum = 0;
        for (int i = n-1; i < 0; i--) {
            while (i >= 0) {
                if (nums[i] > nums[i-1]) {
                    sum += nums[i] - nums[i-1];
                    i--;
                } else {
                    sum += nums[i];
                }
                i--;
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        String s = "MCMXCIV";
        System.out.println(romanToInt(s));
    }
}
