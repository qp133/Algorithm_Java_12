public class _905_Sort_Array_By_Parity {
    public static int[] sortArrayByParity(int[] nums) {
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 != 0) {
                nums[k] = nums[i];
                i++;
            }
        }
        return new int[]{k};
    }

    public static void main(String[] args) {
        int[] nums = {2,1,3,4};

        sortArrayByParity(nums);

        for (int i : nums) {
            System.out.print(i + "\t");
        }
    }
}
