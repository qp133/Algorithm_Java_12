import java.lang.reflect.Array;
import java.util.Arrays;

public class _88_MergeSortedArray {
    public static void merge(int[] nums1, int m, int[] nums2, int n){
        int i = m - 1;
        int j = n - 1;
        int k = (m+n) - 1;

        while (k >= 0) {
            if (j < 0) {        //Mảng 2 không có phần tử nào
                nums1[k] = nums1[i];
                i--;
            } else if (i < 0) {     //Mảng 1 không có phần tử nào
                nums1[k] = nums2[j];
                j--;
            } else if (nums1[i] > nums2[j]) {
                nums1[k] = nums1[i];
                i--;
            } else { //nums1[i] < nums2[j]
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        System.out.println(Arrays.toString(nums1));
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6};
        int m = 3, n = 3;

        merge(nums1, m, nums2, n);
    }
}
