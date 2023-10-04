import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Bai1 {
    public static void main(String[] args) {
        List<Integer> string = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        double test = string.stream().filter(a->a%2==0).reduce(0,(Integer::sum));
        System.out.println(test);
    }
}
