package TrenLop;

import java.util.Scanner;

public class DemKyTu {
    public static void main(String[] args) {
        // Bước 1: Khai báo một chuỗi và gán cho nó một giá trị
        String chuoi = "Hello, world!";

        // Bước 2: Khai báo một biến ký tự và nhập giá trị từ bàn phím
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập một ký tự: ");
        char kyTu = scanner.next().charAt(0);

        // Bước 3: Khai báo biến count và gán giá trị 0, để lưu số ký tự đếm được trong chuỗi
        int count = 0;

        // Bước 4: Sử dụng vòng lặp duyệt từng ký tự trong chuỗi và so sánh
        for (int i = 0; i < chuoi.length(); i++) {
            if (chuoi.charAt(i) == kyTu) {
                count++;
            }
        }

        // In ra kết quả
        System.out.println("Số lần ký tự '" + kyTu + "' xuất hiện trong chuỗi: " + count);

        // Đóng Scanner
        scanner.close();
    }
}
