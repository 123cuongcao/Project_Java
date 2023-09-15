package TrenLop;

import java.util.Scanner;

public class ChenPhanTuVaoMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số phần tử của mảng: ");
        int N = scanner.nextInt();

        int[] array = new int[N];
        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < N; i++) {
            array[i] = scanner.nextInt();
        }

        System.out.print("Nhập giá trị cần chèn: ");
        int X = scanner.nextInt();
        System.out.print("Nhập vị trí cần chèn (0 <= index <= " + N + "): ");
        int index = scanner.nextInt();

        if (index < 0 || index > N) {
            System.out.println("Vị trí cần chèn không hợp lệ.");
        } else {
            int[] newArray = new int[N + 1];
            for (int i = 0, j = 0; i < N + 1; i++) {
                if (i == index) {
                    newArray[i] = X;
                } else {
                    newArray[i] = array[j];
                    j++;
                }
            }

            System.out.println("Mảng sau khi chèn phần tử " + X + " vào vị trí " + index + " là:");
            for (int i = 0; i < N + 1; i++) {
                System.out.print(newArray[i] + " ");
            }
        }

        scanner.close();
    }
}

