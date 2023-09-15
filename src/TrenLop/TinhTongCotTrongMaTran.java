package TrenLop;

import java.util.Scanner;

public class TinhTongCotTrongMaTran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số hàng của ma trận: ");
        int rows = scanner.nextInt();
        System.out.print("Nhập số cột của ma trận: ");
        int columns = scanner.nextInt();

        double[][] matrix = new double[rows][columns];
        System.out.println("Nhập các phần tử của ma trận:");

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                matrix[i][j] = scanner.nextDouble();
            }
        }

        System.out.print("Nhập thứ tự của cột cần tính tổng (tính từ 0): ");
        int columnToSum = scanner.nextInt();

        double sum = 0.0;
        for (int i = 0; i < rows; i++) {
            sum += matrix[i][columnToSum];
        }

        System.out.println("Tổng của cột " + columnToSum + " là: " + sum);

        scanner.close();
    }
}
