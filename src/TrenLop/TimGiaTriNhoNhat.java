package TrenLop;

import java.util.Scanner;

public class TimGiaTriNhoNhat {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        int minValue = array[0];
        for (int i = 1; i < N; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        System.out.println("Giá trị nhỏ nhất trong mảng là: " + minValue);

        scanner.close();
    }
}

