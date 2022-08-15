import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(1,"Nguyễn Văn A", 20, 5));
        list.add(new Student(2, "Nguyễn Thị A", 19, 6));
        list.add(new Student(3, "Nguyễn Văn A", 24, 7));
        list.add(new Student(4, "Hoàng Văn C", 21, 8));
        list.add(new Student(5, "Lê Thị B", 27, 9));
        list.add(new Student(6, "Nguyễn Văn A", 18, 10));
        list.add(new Student(7, "Trần Văn D", 20, 6));
        list.add(new Student(8, "Trần Thị E", 22, 9));
        list.add(new Student(9, "Phạm Thị E", 23, 7));
        list.add(new Student(10,"Hoàng Văn F", 21, 5));

//        int idx = Collections.binarySearch(list, new Student(8, null, 0 , 0),
//                (o1,o2) -> o1.getId() - o2.getId());

//        System.out.println(idx);

//        Student fstudent = findStudentById(9, list);

//        Comparator<Student> comparator = new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                return o1.getId() - o2.getId();
//            }
//        };
//
//        int idxStudent = Collections.binarySearch(list, fstudent, comparator);


        //Optinal:
        Optional<Student> student = findStudentById(10,list);
        if (student.isPresent()) {
            System.out.println(student.get());
        } else {
            System.out.println("Không tìm thấy");
        }

        student.ifPresent(s -> s.setAge(22));
        System.out.println(student.get());



        //Sắp xếp học sinh theo name, nếu giống name thì ai nhiều tuổi hơn
        //người đó đứng trước
//        list.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int compareByName = o1.getName().compareTo(o2.getName());
//                //System.out.println(o1.getName() + " - " + o2.getName() + " - " + compareByName);
//
//                //Nếu tên giống nhau -> sắp xếp theo tuổi
//                if (compareByName == 0) {
//                    return o2.getAge() - o1.getAge();
//                }
//                return compareByName;
//
//            }
//        });

//        print(list);
//
//        System.out.println("------------------");
        //Sắp xếp học sinh theo tuổi tăng dần, nếu bằng tuổi thì xếp theo GPA giảm dần
//        list.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int compareByAge = o1.getAge() - o2.getAge();
//                if (compareByAge == 0) {
//                    return o2.getGPA() - o1.getGPA();
//                }
//                return compareByAge;
//            }
//        });
//
//        print(list);

//        System.out.println("----------------");
        //Sắp xếp theo tên. (Ví dụ là Hoàng Văn A, thì chỉ xét A)
//        list.sort(new Comparator<Student>() {
//            @Override
//            public int compare(Student o1, Student o2) {
//                int spaceIdx1 = o1.getName().lastIndexOf(" ");
//                String subStr1 = o1.getName().substring(spaceIdx1 + 1);
//
//                int spaceIdx2 = o2.getName().lastIndexOf(" ");
//                String subStr2 = o2.getName().substring(spaceIdx2 + 1);
//
//                return subStr1.compareTo(subStr2);
//            }
//        });
//
//        print(list);
//    }
//
//    public static void print(ArrayList<Student> list) {
//        for(Student s : list) {
//            System.out.println(s);
//        }

    }

    public static Optional<Student> findStudentById(int id, List<Student> list) {
        for(Student s : list) {
            if (s.getId() == id) {
                return Optional.of(s);
            }
        }
        return Optional.empty();
    }
}
