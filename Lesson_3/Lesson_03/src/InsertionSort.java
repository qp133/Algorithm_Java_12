import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};

        long start = System.nanoTime();
        sortArray(arr);
        long end = System.nanoTime();

        System.out.println(Arrays.toString(arr));


    }

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i-1;

            while (j >= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }
}
