import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Bai10 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("cao duc cuong");
        list.add("bao duc cuong");
        list.add("dao duc cuong");
        list.add("fao duc cuong");
        list.add("gao duc cuong");
        list.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList()).forEach(System.out::println);
    }
}
