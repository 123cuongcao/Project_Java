import java.util.ArrayDeque;
import java.util.Queue;

public class bai_1 {
    public static void main(String[] args) {
        Queue<String> test = new ArrayDeque<>();
        test.offer("cường");
        test.offer("cường1");
        test.offer("cường2");
        test.offer("cường3");
        test.offer("cường4");
        System.out.println(test);
//        while(!test.isEmpty()){
//            System.out.println(test);
//        }
    }
}
