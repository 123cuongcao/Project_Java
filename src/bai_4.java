import java.util.Scanner;
import java.util.Stack;

public class bai_4 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        test4();
    }

    public static void test4() {
        Stack<String> test = new Stack<>();
        System.out.println("Hãy nhập số từ bạn muốn thêm");
        int n = Integer.parseInt(sc.nextLine());
        for (int i = 0; i < n; i++) {
            System.out.println("Nhập từ thứ " + (i + 1));
            String want = sc.nextLine();
            test.push(want);
        }

        while (!test.isEmpty()) {
            System.out.println(test.remove(test.size() - 1));
        }
    }
}
