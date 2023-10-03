import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class bai_10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<String> stack = new Stack<>();
        String string;
        System.out.println("Hãy nhập vào ");
        string  = sc.nextLine();
        String[] arr= string.split("[*/+\\-]");
        System.out.println(Arrays.toString(arr));

        for(int i= arr.length-1; i>=0;i--){
            stack.push(arr[i]);
        }
        double sum = Double.parseDouble(stack.pop());
        for(int i=0;i<string.length();i++){
            switch(string.charAt(i)){
                case '+':
                    sum+=Double.parseDouble(stack.pop()) ;
                    break;
                case '-':
                    sum-=Double.parseDouble(stack.pop());
                case '*':
                    sum*=Double.parseDouble(stack.pop());
                case '/':
                    sum/=Double.parseDouble((stack.pop()));
            }
        }

        System.out.println("tỗng hết quả ="+sum);

    }

}
