import java.util.Arrays;
import java.util.List;

public class Bai9 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(12,2,33,4,5,64,7,85,9);
        List<Integer> want = list.stream().filter(a->a>10).toList();
        System.out.println(want.toArray().length);
    }
}
