public class Test {
    public static void main(String[] args) {
        String name = "Nguyễn Văn A";
        int spaceIdx = name.lastIndexOf(" ");
        String subStr = name.substring(spaceIdx + 1);
        System.out.println(subStr);
    }

}
