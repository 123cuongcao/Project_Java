import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Bai4 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9);
        list.stream().sorted(Comparator.comparingInt(a -> (int) a).reversed()).limit(3).forEach(System.out::println);
    }
}
