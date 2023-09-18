package TrenLop;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        String chuoi = "Hello, world!";

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char kyTu = scanner.next().charAt(0);

        int count = 0;

        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        System.out.println("Số lần ký tự '" + kyTu + "' xuất hiện trong chuỗi: " + count);

        scanner.close();
    }
}
