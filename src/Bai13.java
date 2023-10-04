import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Bai13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list = Arrays.asList(1,2,3,4,5,6,7,8,9,10);
        System.out.println("hãy hập vào số muồn kiễm tra");
        int want = Integer.parseInt(sc.nextLine());
        List<Integer> after =  list.stream().filter(a->want>a).toList();
        System.out.println(after);
    }
}
