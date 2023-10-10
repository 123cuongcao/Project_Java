package src;

import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("hãy nhập cố bị chia");
        int num1 = Integer.parseInt(sc.nextLine());
        System.out.println("Hãy nhập số chia");
        int num2 = Integer.parseInt(sc.nextLine());
//        float num3 = num1/num2;
//        System.out.println(num3);
        try{
            int num3 =  num1 /num2;
            System.out.println(num3);
        }catch(ArithmeticException o){
            System.out.println("số chia không thể là không");
        }
    }
}
