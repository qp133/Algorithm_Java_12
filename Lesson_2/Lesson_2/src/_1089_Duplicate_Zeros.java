import java.util.Arrays;

public class _1089_Duplicate_Zeros {
    public static void duplicateZeros(int[] arr) {
        int n = arr.length;
        int[] arrClone = new int[n];

        for (int i = 0, j = 0; i < n && j < n; i++, j++ ) {
            if (arr[i] == 0) {
                arrClone[j] = arr[i];
                j++;
            }
            if (j >= n) {
                break;
            }
            arrClone[j] = arr[i];
        }

        for (int i = 0; i < n; i++) {
            arr[i] = arrClone[i];
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,0,2,3,0,4,5,0};
        duplicateZeros(arr);

        System.out.println(Arrays.toString(arr));
    }
}
