public class Student {
    private int id;
    private String name;
    private int age;
    private int GPA;

    public Student(int id, String name, int age, int GPA) {
        this.id = id;
        this.name = name;
        this.age = age;
        this.GPA = GPA;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getGPA() {
        return GPA;
    }

    public void setGPA(int GPA) {
        this.GPA = GPA;
    }

    @Override
    public String toString() {
        return id + " - " + name + " - " + age + " - " + GPA;
    }
}
