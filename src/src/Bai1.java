package src;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Bai1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true){
            try{
                System.out.println("Hãy nhập vào số nguyên thứ nhất");
                int num1 = sc.nextInt();
                System.out.println("Hãy nhập vào số nguyên thứ hai");
                int num2 = sc.nextInt();
                System.out.println("Tổng của 2 só là: "+(num2+num1));
                break;
            }catch (InputMismatchException e){
                System.out.println("số phải là số nguyên");
            }finally {
                sc.close();

            }
        }
    }

}
