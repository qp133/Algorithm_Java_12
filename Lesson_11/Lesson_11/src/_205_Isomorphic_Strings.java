import java.util.HashMap;

public class _205_Isomorphic_Strings {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> hashMap = new HashMap<>();
        for (int i = 0; i < s.length() - 1; i++) {
            char ch1 = s.charAt(i);
            char ch2 = t.charAt(i);
            System.out.println(ch1 + " - " + ch2);

            if (hashMap.containsKey(ch1)) {
                if (hashMap.get(ch1) != ch2) {
                    return false;
                }
            } else {
                if (hashMap.containsValue(ch2)) {
                    return false;
                }
                hashMap.put(ch1, ch2);
            }

            //1: Kiểm tra key đã tồn tại hay chưa
            //TH1: Chưa tồn tại
            //1.1: Kiểm tra tồn tại Value ch2 hay chưa
            //Nếu tồn tại -> return False
            //Chưa tồn tại -> put vào danh sách

            //TH2: Đã tồn tại key ch1
            //1.2: Kiểm tra với key ch1, value có giống với ch2 hay không
            //Nếu giống -> Bỏ qua
            //Nếu khác nhau -> return False
        }
        return true;
    }
}
