package BaiTap;

import java.util.Scanner;

public class ChuyenDoiNhietDo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int luaChon;

        do {
            System.out.println("***************** MENU *****************");
            System.out.println("1. Chuyển đổi từ độ Celsius (°C) sang độ Fahrenheit (°F)");
            System.out.println("2. Chuyển đổi từ độ Fahrenheit (°F) sang độ Celsius (°C)");
            System.out.println("3. Thoát");
            System.out.print("Chọn một trong các tùy chọn trên: ");
            luaChon = scanner.nextInt();

            switch (luaChon) {
                case 1:
                    chuyenDoiCtoF();
                    break;
                case 2:
                    chuyenDoiFtoC();
                    break;
                case 3:
                    System.out.println("Ứng dụng đã thoát.");
                    break;
                default:
                    System.out.println("Lựa chọn không hợp lệ. Vui lòng chọn lại.");
            }
        } while (luaChon != 3);
        scanner.close();
    }
    private static void chuyenDoiCtoF() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ độ Celsius (°C): ");
        double doCelsius = scanner.nextDouble();
        double doFahrenheit = (doCelsius * 9/5) + 32;
        System.out.println("Nhiệt độ tương ứng là " + doFahrenheit + " độ Fahrenheit (°F)");
    }
    private static void chuyenDoiFtoC() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập nhiệt độ độ Fahrenheit (°F): ");
        double doFahrenheit = scanner.nextDouble();
        double doCelsius = (doFahrenheit - 32) * 5/9;
        System.out.println("Nhiệt độ tương ứng là " + doCelsius + " độ Celsius (°C)");
    }
}
