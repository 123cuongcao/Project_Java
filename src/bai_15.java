import java.util.Scanner;
import java.util.Stack;

public class bai_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy hập vào hệ thập phân cần chuyển ỗi");
        int want = Integer.parseInt(sc.nextLine());
        Stack<Integer> stack = new Stack<>();
        while(want>0){
            stack.push(want%2);
            want = want/2;
        }
        System.out.println("chuyển đổi nhị phÂN");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }
    }
}
