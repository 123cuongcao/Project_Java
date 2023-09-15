package TrenLop;

import java.util.Scanner;

public class GopHaiMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng 1: ");
        int N1 = scanner.nextInt();

        int[] array1 = new int[N1];
        System.out.println("Nhập các phần tử của mảng 1:");
        for (int i = 0; i < N1; i++) {
            array1[i] = scanner.nextInt();
        }

        System.out.print("Nhập số phần tử của mảng 2: ");
        int N2 = scanner.nextInt();

        int[] array2 = new int[N2];
        System.out.println("Nhập các phần tử của mảng 2:");
        for (int i = 0; i < N2; i++) {
            array2[i] = scanner.nextInt();
        }

        int[] mergedArray = new int[N1 + N2];

        for (int i = 0; i < N1; i++) {
            mergedArray[i] = array1[i];
        }

        for (int i = 0; i < N2; i++) {
            mergedArray[N1 + i] = array2[i];
        }

        System.out.println("Mảng sau khi gộp mảng 1 và mảng 2 là:");
        for (int i = 0; i < N1 + N2; i++) {
            System.out.print(mergedArray[i] + " ");
        }

        scanner.close();
    }
}
