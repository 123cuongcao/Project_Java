package TrenLop;

import java.util.Scanner;

public class XoaPhanTuTrongMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();
        int[] array = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập phần tử cần xoá: ");
        int X = scanner.nextInt();

        int[] newArray = new int[N];
        int newSize = 0;

        for (int i = 0; i < N; i++) {
            if (array[i] != X) {
                newArray[newSize] = array[i];
                newSize++;
            }
        }

        System.out.println("Mảng sau khi xoá tất cả các phần tử " + X + " là:");
        for (int i = 0; i < newSize; i++) {
            System.out.print(newArray[i] + " ");
        }

    }
}
