import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {4,2,1,5,3};
        //sort(arr);

        long start = System.nanoTime();
        sortArray(arr);
        long end = System.nanoTime();
        System.out.println(end - start);

        System.out.println(Arrays.toString(arr));
    }

    public static int[] sortArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;

            //Tìm index của phần tử nhỏ nhất
            for (int j = i+1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            //Hoán đổi phần tử nhỏ nhất với phần tử đầu tiên
            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
