import java.util.Arrays;

public class HW_26_Remove_Duplicates_from_Sorted_Array {
    public static int removeDuplicates(int[] nums) {
        int removeElement = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i-1] == nums[i]) {
                removeElement++;
            }
            nums[i - removeElement] = nums[i];
        }
        return nums.length - removeElement;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3,3,4};
        removeDuplicates(nums);
        System.out.println(Arrays.toString(nums));
    }
}
