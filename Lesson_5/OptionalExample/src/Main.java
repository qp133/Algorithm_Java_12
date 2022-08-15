import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        Optional<String> emptyOptinal = Optional.empty();

        Optional<String> optionalS = Optional.of("Hello");

        //Kiểm tra rỗng
        System.out.println(emptyOptinal.isEmpty());

        System.out.println(optionalS.isPresent());

        String value = optionalS.get();
        System.out.println(value);

        String value1 = emptyOptinal.get();
        System.out.println(value1);


        List<String> list = Arrays.asList("Java", "JS", "C/C++");
        String rs = list.stream().filter(s -> s.equals("Java")).toString();

    }
}
