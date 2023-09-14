package BaiTap;

import java.util.Scanner;

public class TimSinhVien {
    public static void main(String[] args) {
        // Danh sách tên sinh viên (có thể thay đổi theo nhu cầu)
        String[] danhSachSinhVien = {
                "SinhVien1",
                "SinhVien2",
                "SinhVien3",
                "SinhVien4",
                "SinhVien5"
        };

        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập tên sinh viên cần tìm: ");
        String tenSinhVienCanTim = scanner.nextLine();

        int viTri = -1; // Khởi tạo viTri bằng -1 để kiểm tra nếu không tìm thấy

        for (int i = 0; i < danhSachSinhVien.length; i++) {
            if (danhSachSinhVien[i].equalsIgnoreCase(tenSinhVienCanTim)) {
                viTri = i;
                break; // Dừng vòng lặp nếu tìm thấy
            }
        }

        if (viTri != -1) {
            System.out.println("Sinh viên '" + tenSinhVienCanTim + "' được tìm thấy tại vị trí " + viTri);
        } else {
            System.out.println("Không tìm thấy sinh viên '" + tenSinhVienCanTim + "' trong danh sách.");
        }

        scanner.close();
    }


}
