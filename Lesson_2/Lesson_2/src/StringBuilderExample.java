public class StringBuilderExample {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("java");

        System.out.println(str);

        str.append(" abc");
        System.out.println(str);

        str.insert(2, "xyz");
        System.out.println(str);

        str.replace(2,8, "XYZ");
        System.out.println(str);

        str.reverse();
        System.out.println(str);
    }
}
