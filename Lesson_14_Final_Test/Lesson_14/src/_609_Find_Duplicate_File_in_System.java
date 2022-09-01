import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class _609_Find_Duplicate_File_in_System {
    public static List <List<String> > findDuplicate(String[] paths) {
        HashMap< String, List<String> > map = new HashMap<>();
        for (String path: paths) {
            //tách chuỗi dựa trên khoảng trắng -> được 3 chuỗi nhỏ
            String[] values = path.split(" ");

            for (int i = 1; i < values.length; i++) {

                //tách chuỗi sau ký tự "("
                String[] name_cont = values[i].split("\\(");

                //replace ký tự ")"
                name_cont[1] = name_cont[1].replace(")", "");

                //kiểm tra tồn tại trong list
                List < String > list = map.getOrDefault(name_cont[1], new ArrayList< String >());
                //getOrDefault(key,value)

                list.add(values[0] + "/" + name_cont[0]);

                map.put(name_cont[1], list);
            }
        }
        List < List<String> > res = new ArrayList<>();
        for (String key: map.keySet()) {
            if (map.get(key).size() > 1)
                res.add(map.get(key));
        }
        return res;
    }

    public static void main(String[] args) {
        String[] paths = {"root/a 1.txt(abcd) 2.txt(efgh)",
                "root/c 3.txt(abcd)",
                "root/c/d 4.txt(efgh)",
                "root 4.txt(efgh)"};

        System.out.println(findDuplicate(paths));
    }
}
