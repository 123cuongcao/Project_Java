import java.util.Scanner;
import java.util.Stack;

public class bai_14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhẫp dãy số nguyên tố :");
        String want = sc.nextLine();
        Stack<Character> stack = new Stack<>();
        for (char c:want.toCharArray()) {
            stack.push(c);
        }
        boolean check = true;
        for (char c:stack) {
            int num = Character.getNumericValue(c);
            if(!isPrime(num)){
                check = false;
                break;
            }
        }
        if(check){
            System.out.println("Dãy nhập vào là dãy số nguyên tố ");
        }


    }
    public static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
