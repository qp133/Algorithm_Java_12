public class _1672_Richest_Customer_Wealth {
    public static int maximumWealth(int[][] accounts) {
        int sum[] = new int[accounts.length];

        for (int i = 0; i < accounts.length; i++) {
            for (int j = 0; j < accounts[i].length; j++) {
                sum[i] += accounts[i][j];
            }
        }

        int max = 0;
        for (int i = 0; i < sum.length; i++) {
            if (sum[i] > max) {
                max = sum[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        int[][] accounts = {{1,5},
                            {7,3},
                            {3,5}};

        System.out.println(maximumWealth(accounts));
    }
}
