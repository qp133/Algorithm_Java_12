import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("Nguyễn Văn A", 20, 5));
        list.add(new Student("Nguyễn Thị A", 19, 6));
        list.add(new Student("Nguyễn Văn A", 24, 7));
        list.add(new Student("Hoàng Văn C", 21, 8));
        list.add(new Student("Lê Thị B", 27, 9));
        list.add(new Student("Nguyễn Văn A", 18, 10));
        list.add(new Student("Trần Văn D", 20, 6));
        list.add(new Student("Trần Thị E", 22, 9));
        list.add(new Student("Phạm Thị E", 23, 7));
        list.add(new Student("Hoàng Văn F", 21, 5));

        //Sắp xếp học sinh theo name, nếu giống name thì ai nhiều tuổi hơn
        //người đó đứng trước
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compareByName = o1.getName().compareTo(o2.getName());
                //System.out.println(o1.getName() + " - " + o2.getName() + " - " + compareByName);

                //Nếu tên giống nhau -> sắp xếp theo tuổi
                if (compareByName == 0) {
                    return o2.getAge() - o1.getAge();
                }
                return compareByName;

            }
        });

        print(list);

        System.out.println("------------------");
        //Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int compareByAge = o1.getAge() - o2.getAge();
                if (compareByAge == 0) {
                    return o2.getGPA() - o1.getGPA();
                }
                return compareByAge;
            }
        });

        print(list);

        System.out.println("----------------");
        //Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A)
        list.sort(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                int spaceIdx1 = o1.getName().lastIndexOf(" ");
                String subStr1 = o1.getName().substring(spaceIdx1 + 1);

                int spaceIdx2 = o2.getName().lastIndexOf(" ");
                String subStr2 = o2.getName().substring(spaceIdx2 + 1);

                return subStr1.compareTo(subStr2);
            }
        });

        print(list);
    }

    public static void print(ArrayList<Student> list) {
        for(Student s : list) {
            System.out.println(s);
        }
    }
}
