package TrenLop;

import java.util.Scanner;

public class MangHaiChieu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập kích thước của ma trận vuông: ");
        int size = scanner.nextInt();

        double[][] matrix = new double[size][size];
        System.out.println("Nhập các phần tử của ma trận:");

        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        double sum = 0.0;
        for (int i = 0; i < size; i++) {
            sum += matrix[i][i];
        }

        System.out.println("Tổng của đường chéo chính là: " + sum);

        scanner.close();
    }
}
