import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class bai_5 {

    public static void main(String[] args) {
        System.out.println("Hãy nhập 1 chuỗi bạn muốn kiểm tra");
        Scanner sc = new Scanner(System.in);
        String test = sc.nextLine();
        boolean result = test(test);

        if (result) {
            System.out.println("Chuỗi đúng!");
        } else {
            System.out.println("Chuỗi không đúng!");
        }
    }

    public static boolean test(String string) {
        Stack<Character> stack = new Stack<>();
        Queue<Character> queue = new ArrayDeque<>();

        for (char c : string.toCharArray()) {
            stack.push(c);
        }
        for (char c : string.toCharArray()) {
            queue.offer(c);
        }

        while (!stack.isEmpty() && !queue.isEmpty()) {
            if (stack.pop() != queue.poll()) {
                return false;
            }
        }

        return stack.isEmpty() && queue.isEmpty();
    }
}
