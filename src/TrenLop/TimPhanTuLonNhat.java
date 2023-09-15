package TrenLop;

import java.util.Scanner;

public class TimPhanTuLonNhat {
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

        double maxElement = matrix[0][0];
        int maxRow = 0;
        int maxColumn = 0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (matrix[i][j] > maxElement) {
                    maxElement = matrix[i][j];
                    maxRow = i;
                    maxColumn = j;
                }
            }
        }

        System.out.println("Phần tử lớn nhất trong ma trận là " + maxElement);
        System.out.println("Tọa độ của phần tử lớn nhất là (dòng " + (maxRow + 1) + ", cột " + (maxColumn + 1) + ")");

        scanner.close();
    }
}
