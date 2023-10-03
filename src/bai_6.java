import java.util.Scanner;
import java.util.Stack;

public class bai_6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập chuỗi vào để kiểm tra");
        String test = sc.nextLine();
        boolean result = test(test);

        if (result) {
            System.out.println("Chuỗi ngoặc đúng!");
        } else {
            System.out.println("Chuỗi ngoặc không đúng!");
        }
    }

    public static boolean test(String string) {
        Stack<Character> stack = new Stack<>();

        for (char c : string.toCharArray()) {
            if (c == '(') {
                stack.push(c);
            } else if (c == ')') {
                if (stack.isEmpty()) {
                    return false;
                }
                stack.pop();
            }
        }
        return stack.isEmpty();
    }
}
