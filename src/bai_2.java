import java.util.Stack;

public class bai_2 {
    public static void main(String[] args) {
        String testString1 = "{[()]}";
        String testString2 = "{[(])}";
        String testString3 = "((()))";

        System.out.println(testString1 + " is valid: " + test(testString1));
        System.out.println(testString2 + " is valid: " + test(testString2));
        System.out.println(testString3 + " is valid: " + test(testString3));

    }

    public static boolean test(String arr){
        Stack<Character> stack = new Stack<>();
        for (char c:arr.toCharArray()) {
            if(c=='(' || c=='{' ||c=='[' ){
                stack.push(c);
            }else if(c==')' ||c=='}'  ||c==']'){
                if(stack.isEmpty()){
                    return false;
                }
                char top = stack.pop();
                if((c == ')' && top != '(') || (c == '}' && top != '{') || (c == ']' && top != '[')){
                    return false;
                }
            }
        }
        return  stack.isEmpty();
    }
}
