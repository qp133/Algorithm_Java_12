import java.util.HashMap;

public class HW_136_Single_Number {
    public static int singleNumber(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                map.put(nums[i], map.get(nums[i] + 1));
            } else {
                map.put(nums[i], 1);
            }
        }

        for (int i : map.keySet()) {
            if (map.get(i) == 1) {
                return i;
            }
        }
        return 0;
    }

    public static void main(String[] args) {
        int[] nums = {4,1,2,1,2};
        System.out.println(singleNumber(nums));
    }
}
