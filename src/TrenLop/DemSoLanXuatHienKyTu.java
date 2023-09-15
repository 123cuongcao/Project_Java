package TrenLop;

import java.util.Scanner;

public class DemSoLanXuatHienKyTu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập chuỗi: ");
        String chuoi = scanner.nextLine();

        System.out.print("Nhập ký tự cần đếm: ");
        char kyTu = scanner.next().charAt(0);

        int dem = 0;
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                dem++;
            }
        }

        System.out.println("Số lần xuất hiện của ký tự '" + kyTu + "' trong chuỗi là: " + dem);

        scanner.close();
    }
}
