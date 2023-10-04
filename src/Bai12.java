import java.util.Arrays;
import java.util.List;

public class Bai12 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
       double test =  list.stream().filter(a->a%3==0).reduce(0, Integer::sum);
        System.out.println(test);
    }
}
