import java.lang.reflect.Array;
import java.util.Arrays;

public class MergeSort {
    public static int[] sort(int[] nums, int iL, int iR) {
        //Điều kiện dừng
        if (iL == iR) {     //Mảng chỉ có một phần tử
            int[] singleElement = {nums[iL]};
            return singleElement;
        }

        //Công thức Đệ quy

        //Chia mảng ra
        int iM = (iL + iR)/2;
        int[] nums1 = sort(nums, iL, iM);
        int[] nums2 = sort(nums, iM+1, iR);

        //Gộp mảng
        int[] result = merge(nums1, nums2);
        return result;
    }

    public static int[] merge(int[] nums1, int[] nums2) {
        int n = nums1.length + nums2.length;
        int[] result = new int[n];

        int i = 0;      //Chạy trên mảng result
        int i1 = 0;     //Chạy trên mảng nums1
        int i2 = 0;     //Chạy trên mảng nums2

        while(i < n) {
            //Cả hai mảng không rỗng
            if (i1 < nums1.length && i2 < nums2.length) {
                if (nums1[i1] < nums2[i2]) {
                    result[i] = nums1[i1];
                    i1++;
                    i++;
                } else {
                    result[i] = nums2[i2];
                    i2++;
                    i++;
                }
            } else {        //Một trong hai mảng rỗng
                if (i1 < nums1.length) {        //nums1 khác rỗng, nums2 rỗng
                    result[i] = nums1[i1];
                    i1++;
                    i++;
                } else {        //nums1 rỗng, nums2 khác rỗng
                    result[i] = nums2[i2];
                    i2++;
                    i++;
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
//        int[] nums1 = {1,3,7,8};
//        int[] nums2 = {2,5,6};
//        int[] rs = merge(nums1, nums2);
//        System.out.println(Arrays.toString(rs));

        int[] nums = {3,7,8,1,2,6,5};
        int[] rs = sort(nums, 0, nums.length-1);
        System.out.println(Arrays.toString(rs));
    }
}
