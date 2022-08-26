import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class _349_Intersection_of_Two_Arrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        HashSet<Integer> set = new HashSet<>();

        for (int i = 0; i < nums1.length; i++) {
            hashMap.put(nums1[i], 1);
        }
        for (int i = 0; i < nums2.length; i++) {
            if (hashMap.containsKey(nums2[i])) {
                set.add(nums2[i]);
            }
        }
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}
