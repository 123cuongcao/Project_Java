package src;

import java.util.Scanner;

public class Bai8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập 1 số để kiểm tra");
        int num1 = Integer.parseInt(sc.nextLine());
        if(num1 ==2){
            System.out.println("là số nguyên tố");
        }
        boolean check = true;
        try{
            if(num1<2){
                throw new RuntimeException();
            }
            for(int i = 2; i<num1/2;i++){
                if(num1%i==0){
                    System.out.println("K là số nguên tố");
                    check = false;
                    break;
                }
            }
            if(check){
                throw new RuntimeException();
            }
        }catch (RuntimeException e){
            System.out.println("ko phải là số nguyên tố");
        }

    }
}
