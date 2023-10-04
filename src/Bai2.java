import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Bai2 {
    public static void main(String[] args) {
        List<String> string = new ArrayList<>();
        string.add("cao đức cường");
        string.add("cao1");
        string.add("cao2");
        string.add("cao3");
        string.add("cao4");
        string.add("cao5");
        string.add("cao6");

        string.stream().filter(a->a.length()>5).forEach(System.out::println);
    }
}
