package BaiTap;
import java.util.Scanner;
public class DaoNguocMang {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nhập số lượng phần tử của mảng (tối đa 20): ");
        int n = scanner.nextInt();

        if (n <= 0 || n > 20) {
            System.out.println("Số lượng phần tử không hợp lệ.");
            return;
        }

        int[] arr = new int[n];

        System.out.println("Nhập các phần tử của mảng:");
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = scanner.nextInt();
        }

        daoNguocMang(arr);

        System.out.println("Mảng sau khi đảo ngược:");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }

        scanner.close();
    }

    private static void daoNguocMang(int[] arr) {
        int left = 0;
        int right = arr.length - 1;

        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;

            left++;
            right--;
        }
    }
}
