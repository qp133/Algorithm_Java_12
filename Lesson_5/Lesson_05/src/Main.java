import java.util.*;

public class Main {
    public static int search(int[] nums, int target) {
        int n = nums.length;
        int iLeft = 0;
        int iRight = n - 1;
        while (iLeft <= iRight) {
            int iMid = (iLeft + iRight)/2;
            if (target == nums[iMid]) {
                return iMid;
            } else if (target < nums[iMid]) {
                iRight = iMid - 1;
            } else {
                iLeft = iMid + 1;
            }
        }
        return -1;
    }

    public static int search1(int[] nums, int target) {
        for (int i = 0; i < nums.length; i++) {
            if (target == nums[i]) {
                return i;
            }
        }
        return -1;
    }

    public static int search2(int[] nums, int target) {
        return searchByCursion(nums, target, 0, nums.length-1);
    }

    public static int searchByCursion(int[] nums, int target, int iLeft, int iRight) {
        //Điều kiện dừng
        if (iLeft > iRight) {
            return -1;
        }
        //Công thức đệ quy
        int iMid = (iLeft + iRight)/2;
        if (target == nums[iMid]) {
            return iMid;
        } else if (target < nums[iMid]) {
            return searchByCursion(nums, target, iLeft, iMid-1);
        } else {
            return searchByCursion(nums, target, iMid+1, iRight);
        }
    }

    public static void main(String[] args) {
        int[] arr = {-1,0,3,5,9,12};

//        System.out.println(search(arr, 9));
//        System.out.println(search1(arr, 9));
        System.out.println(Arrays.binarySearch(arr, 9));

        String[] array = {"Java", "JS", "Python", "Ruby"};
        List<String> list = new ArrayList<>();
        list = Arrays.asList(array);            //Chuyển mảng -> ArrayList (asList)

        System.out.println(list);
        int idx = Collections.binarySearch(list, "JS", new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });
        System.out.println(idx);

//        Collections.sort(list);
//        System.out.println(list);
//        System.out.println(Collections.binarySearch(list, "JS"));
//
//        list.toArray();      // Chuyển ArrayList sang mảng (toArray)
    }
}
