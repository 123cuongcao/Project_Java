import java.util.Scanner;
import java.util.Stack;

public class bai_9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choice ;

        do {
            System.out.println("1.Đảo ngược chuỗi sử dụng Stack\n");
            System.out.println("2.Đảo ngược phần tử trong mảng số nguyên sử dụng Stack\n");
            System.out.println("3.thoát");
            choice = Integer.parseInt(sc.nextLine());
            String string;
            switch(choice){
                case 1:
                    System.out.println("hãy nhập vào mảng muốn duyệt");
                     string = sc.nextLine();
                    testInt(string);
                    break;
                case 2:
                    System.out.println("hãy nhập vào mảng muốn duyệt");
                     string = sc.nextLine();
                    testInt(string);
                    break;
                case 3:
                    break;
            }

        }while(choice!=3);

    }
    public static void testInt(String string){
        Stack<Character> stack = new Stack<>();
        for (char c:string.toCharArray()) {
            stack.push(c);
        }
        while (!stack.isEmpty()){
            System.out.println(stack.pop());
        }
    }


}
