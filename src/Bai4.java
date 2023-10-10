import java.util.Scanner;

public class Bai4 {
    public static void main(String[] args) {
        int[] myArray = {10, 5, 2, 8, 15, 7, 3, 12};

        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập giá trị cần tìm: ");
        int targetValue = scanner.nextInt();

        int foundIndex = linearSearch(myArray, targetValue);

        if (foundIndex != -1) {
            System.out.println("Giá trị " + targetValue + " được tìm thấy tại vị trí " + foundIndex);
        } else {
            System.out.println("Không tìm thấy giá trị " + targetValue + " trong mảng.");
        }
    }

    private static int linearSearch(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i;
            }
        }
        return -1;
    }
}
