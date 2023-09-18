package BaiTap;

import java.util.Scanner;

public class JavaConsole1 {

         public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Mời nhập số dòng : ");
            int row = Integer.parseInt(scanner.nextLine());
            System.out.println("Mời nhập số cột : ");
            int col = Integer.parseInt(scanner.nextLine());
            int[][] arr = new int[row][col];
            int choice = 0;
            System.out.println("Nhập giá trị các phần tử của mảng:");
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    System.out.println("Mời nhập giá trị cho phần tử tại hàng : " + (i + 1) + " cột " + (j + 1) + ":");
                    arr[i][j] = Integer.parseInt(scanner.nextLine());
                }
            }
            do {
                System.out.println("********MENU********");
                System.out.println("1. In giá trị các phần tử theo ma trận");
                System.out.println("2. In giá trị các phần tử nằm trên đường biên của ma trận và tính tổng");
                System.out.println("3. In giá trị các phần tử nằm trên đường chéo chính và chéo phụ và\n" +
                        "tính tổng");
                System.out.println("4. In ra giá trị lớn nhất và nhỏ nhất trong mảng");
                System.out.println("5.  Sắp xếp mảng tăng dần theo cột");
                System.out.println("6. thoát");
                System.out.println("Mời nhập các chứ năng từ 1-6");
                choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("mảng 2 chiều đã nhập");
                        for (int i = 0; i < row; i++) {
                            for (int j = 0; j < col; j++) {
                                System.out.print(arr[i][j] + "\t");

                            }
                            System.out.println();

                        }
                        break;
                    case 2:
                        int sum = 0;
                        System.out.println("Các phần tử nằm trên đường biên của ma trận:");
                        for (int j = 0; j < col; j++) {
                            System.out.print(arr[0][j] + "\t");
                            sum += arr[0][j];
                        }
                        System.out.println();
                        if (row > 1) {
                            for (int i = 1; i < row - 1; i++) {
                                System.out.print(arr[i][0] + "\t");
                                sum += arr[i][0];
                            }
                            for (int i = 1; i < row - 1; i++) {
                                System.out.print(arr[i][col - 1] + "\t");
                                sum += arr[i][col - 1];
                            }
                        }
                        // In các phần tử trên hàng cuối cùng (trừ phần tử ở góc dưới cùng bên trái)
                        if (row > 1) {
                            for (int j = 0; j < col; j++) {
                                System.out.print(arr[row - 1][j] + "\t");
                                sum += arr[row - 1][j];
                            }
                        }
                        System.out.println("\nTổng các phần tử nằm trên đường biên: " + sum);
                        break;
                }

            } while (choice != 6);
    }
}
