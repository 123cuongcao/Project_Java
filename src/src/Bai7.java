package src;

import java.util.Scanner;

public class Bai7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.println("hãy nhập số thứ nhất");
            int num1 = Integer.parseInt(sc.nextLine());
            System.out.println("hãy nhập số thứ 2");
            int num2 = Integer.parseInt(sc.nextLine());
            if (num1 < num2) {
                System.out.println("số 1 bé hơn số 2");
            } else {
                System.out.println("số 2 bé hơn số 1");
            }
        } catch (NumberFormatException e) {
            System.out.println("số phải là số nguyên");
        }


    }
}
