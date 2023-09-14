package BaiTap;

import java.util.Scanner;

public class UngDungDemSoLuongSinhVienThiDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] diemSinhVien = new double[30];
        int soLuongSinhVien = 0;
        int soLuongThiDo = 0;
        while (soLuongSinhVien < 30) {
            System.out.print("Nhập điểm của sinh viên (để thoát, nhập một giá trị âm): ");
            double diem = scanner.nextDouble();

            if (diem < 0) {
                break;
            }

            diemSinhVien[soLuongSinhVien] = diem;
            soLuongSinhVien++;

            if (diem >= 5) {
                soLuongThiDo++;
            }
        }
        System.out.println("Số lượng sinh viên đã thi đỗ: " + soLuongThiDo);

    }
}
