import java.util.Arrays;

public class _977_Squares_of_a_Sorted_Array {
    public static int[] sortedSquares(int[] nums) {
        int[] clone =new int[nums.length];
        for (int i=0;i<nums.length;i++){
            clone[i]=nums[i]*nums[i];
        }
        Arrays.sort(clone);
        return clone;
    }

    public static void main(String[] args) {
        int[] nums = {-4,-1,0,3,10};

        sortedSquares(nums);
    }
}
