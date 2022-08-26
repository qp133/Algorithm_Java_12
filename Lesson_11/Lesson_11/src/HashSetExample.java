import java.util.HashSet;
import java.util.TreeSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        System.out.println(hashSet.add(5));
        System.out.println(hashSet.add(2));
        System.out.println(hashSet.add(8));
        System.out.println(hashSet.add(9));
        System.out.println(hashSet.add(5));
        System.out.println("-------------");

        hashSet.forEach(i -> System.out.print(i + "\t"));
        System.out.println();

        System.out.println(hashSet.contains(2));

        //chuyển đổi toàn bộ hashSet sang dạng code
        System.out.println(hashSet.hashCode());

        HashSet<Integer> set = new HashSet<>();
        set.add(2);
        set.add(5);

        //hashSet.removeAll(set);   //xóa hết các phần tử trong set, giữ lại các phần tử còn lại
        hashSet.retainAll(set);     //giữ lại toàn bộ phần tử có trong set, xóa hết các phần tử còn lại
        hashSet.forEach(i -> System.out.print(i + "\t"));

        System.out.println("\nTreeSet ");
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(6);
        treeSet.add(1);
        treeSet.add(9);
        treeSet.add(2);
        treeSet.add(5);

        treeSet.forEach(i -> System.out.print(i + "\t"));

        System.out.println("Sắp xếp thứ tự giảm dần:");
        System.out.println(treeSet.descendingSet());
    }
}
