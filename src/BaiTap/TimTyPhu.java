package BaiTap;

import java.util.Scanner;

public class TimTyPhu {
    public static void main(String[] args) {
        double[] danhSachTaiSan = new double[20]; // Khai báo mảng tối đa 20 phần tử
        int soLuongTaiSan = 0;

        Scanner scanner = new Scanner(System.in);

        // Nhập giá trị tài sản từ người dùng
        System.out.println("Nhập giá trị tài sản của các tỷ phú (đơn vị tỉ đô):");
        while (soLuongTaiSan < 20) {
            System.out.print("Nhập giá trị tài sản của tỷ phú " + (soLuongTaiSan + 1) + " (hoặc nhập -1 để kết thúc): ");
            double giaTriTaiSan = scanner.nextDouble();

            if (giaTriTaiSan == -1) {
                break;
            }

            danhSachTaiSan[soLuongTaiSan] = giaTriTaiSan;
            soLuongTaiSan++;
        }

        if (soLuongTaiSan == 0) {
            System.out.println("Danh sách tài sản trống.");
        } else {
            // Tìm giá trị tài sản lớn nhất và vị trí của nó
            double maxGiaTri = danhSachTaiSan[0];
            int viTriMax = 0;

            for (int i = 1; i < soLuongTaiSan; i++) {
                if (danhSachTaiSan[i] > maxGiaTri) {
                    maxGiaTri = danhSachTaiSan[i];
                    viTriMax = i;
                }
            }

            System.out.println("Giá trị tài sản lớn nhất là " + maxGiaTri + " tỉ đô.");
            System.out.println("Nằm ở vị trí " + (viTriMax + 1) + " trong danh sách.");
        }

    }
}

