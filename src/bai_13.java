import com.sun.tools.javac.Main;

import java.util.Scanner;
import java.util.Stack;

public class bai_13 {
    public static void main(String[] args) {
        String inputString = "54321";

        boolean isDecreasing = isDecreasingString(inputString);

        // In kết quả
        if (isDecreasing) {
            System.out.println("Chuỗi giảm dần.");
        } else {
            System.out.println("Chuỗi không giảm dần.");
        }
    }


    public static boolean isDecreasingString(String str) {
        Stack<Character> stack = new Stack<>();
        boolean decreasingFlag = true;

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            while (!stack.isEmpty() && currentChar > stack.peek()) {
                stack.pop();
                decreasingFlag = false;
            }

            stack.push(currentChar);
        }

        return decreasingFlag;
    }

}
