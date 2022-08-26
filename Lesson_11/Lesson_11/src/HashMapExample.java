import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class HashMapExample {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "Java");
        map.put(2, "HTML/CSS");
        map.put(3, "JS");
        map.put(4, "Python");
        map.put(5, "Java");

        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        TreeMap<Integer, String> treeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);    //tăng dần
                //return o2.compareTo(o1);  //giảm dần
            }
        });

        treeMap.put(1, "a");
        treeMap.put(9, "a");
        treeMap.put(8, "a");
        treeMap.put(4, "a");

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}
