package src;

import java.util.Scanner;

public class Bai10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập bán kính hình tròn: ");
            double radius = scanner.nextDouble();

            if (radius < 0) {
                throw new IllegalArgumentException("Lỗi: Bán kính không thể là giá trị âm.");
            }

            double area = calculateCircleArea(radius);
            System.out.println("Diện tích hình tròn là: " + area);
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static double calculateCircleArea(double radius) {
        return Math.PI * Math.pow(radius, 2);
    }
}
