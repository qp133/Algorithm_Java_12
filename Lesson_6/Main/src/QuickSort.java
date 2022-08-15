import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {3,7,8,5,2,6,1};
        sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void sort(int[] nums, int iL, int iR) {
        //Điều kiện dừng
        if (iL >= iR) {
            return;
        }

        //Chọn khóa
        int iM = (iL + iR) /2;
        int key = nums[iM];

        //Phân bố mảng dựa theo khóa, lấy ra chốt
        int pivot = partition(nums, iL, iR, key);
        System.out.println("Chốt: " + pivot);

        //Chia đôi mảng dựa theo chốt
        sort(nums, iL, pivot-1);
        sort(nums, pivot, iR);
    }

    public static int partition(int[] nums, int iL, int iR, int key) {
        int left = iL;
        int right = iR;

        while(left <= right) {
            while (nums[left] < key) {
                left++;
            }
            while (nums[right] > key) {
                right--;
            }

            //Đổi vị trí các phần tử
            if (left <= right) {
                System.out.println("swap: " + nums[left] + " - " + nums[right]);
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
                left++;
                right--;
            }
            System.out.println(Arrays.toString(nums));
        }
        return left;
    }
}
