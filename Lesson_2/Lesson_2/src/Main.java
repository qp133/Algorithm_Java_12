public class Main {
    public static void main(String[] args) {
        String s = "algorithm123";
        char[] arr = s.toCharArray();
        for(char c : arr){
            System.out.println(c + "\t");
        }

        // kiểm tra xem kí tự nhập vào có phải là số hay không
        System.out.println(Character.isDigit('4'));

        for (char c : arr) {
            if(Character.isDigit(c)) {
                System.out.println(c);
            }
        }

        for (char c : arr) {
            System.out.println(c + " có mã ASCII là " + (int)c);
        }
    }
}
