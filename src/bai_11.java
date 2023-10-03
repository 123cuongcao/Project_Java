import java.sql.SQLOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.Stack;

public class bai_11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Stack<Integer> stack = new Stack<>();
        int arr = 0;
        while(arr!=-1){
            System.out.println("Nhập số");
            arr = Integer.parseInt(sc.nextLine());
            stack.push(arr);
        }
        Collections.sort(stack,((a,b)->b-a));
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
        System.out.println("số lớn nất trong mảng");
        System.out.println(stack.firstElement());
    }
}
