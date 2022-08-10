import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int arr[] = {3,7,2,1,9};

        int[] result = insertFirst(arr, 8);
        show(result);

        int[] result2 = insertLast(result, 10);
        show(result2);

//        int[] clone = Arrays.copyOf(arr, arr.length+1);
//        show(clone);
        int[] result3 = insert(arr, 5, 2);
        show(result3);
    }

    public static void show(int[] arr) {
        for (int i : arr) {
            System.out.print(i + "\t ");
        }
        System.out.println();
    }

    //Thêm vào đầu danh sách
    public static int[] insertFirst(int[] arr, int x) {
        int n = arr.length + 1;
        //Tạo mảng kết quả
        int[] result = new int[n];

        //Thêm phần tử vào mảng
        for (int i = 0; i < arr.length; i++) {
            result[i+1] = arr[i];
        }
        result[0] = x;

        return result;
    }

    //Thêm vào cuối danh sách
    public static int[] insertLast(int[] arr, int x) {
        int n = arr.length + 1;
        int[] result = new int[n];

        for (int i = 0; i < n; i++) {
            if (i != (n-1)) {
                result[i] = arr[i];
            } else {
                result[i] = x;
            }
        }

        return result;
    }

    //Thêm vào vị trí bất kỳ
    public static int[] insert(int[] arr, int x, int position) {
        int n = arr.length + 1;

        int[] result = Arrays.copyOf(arr, n);

        //Kiểm tra vị trí thêm
        if (position >= 0 && position <= (n-1)) {
            for (int i = n-1; i > position; i--) {
                result[i] = result[i-1];
            }
            result[position] = x;
        }
        return result;
    }

    //Xóa và trả về số phần tử còn lại
    public static int delete(int[] arr, int x) {
        int n = arr.length;
        //Tìm phần tử cần xóa nằm ở vị trí nào
//        int position = search(arr, x);
        //TH1: Không tìm thấy phần tử cần xóa -> K có gì thay đổi -> return n

        //TH2: Tìm thấy phần tử cần xóa -> Xóa phần tử -> return n-1;
        return n;
    }

    //Trả về index của phần tử cần tìm
//    public static int search(int[] arr, int x) {
//        for () each -> return index, nếu không tìm thấy thì return -1
//
//    }
}
