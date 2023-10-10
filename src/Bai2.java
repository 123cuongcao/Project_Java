public class Bai2 {

    public static void main(String[] args) {
        int[] myArray = {5, 12, 7, 1, 9, 3, 15, 8};

        System.out.print("Mảng số nguyên: ");
        printArray(myArray);

        int minNumber = linearSearchMin(myArray);

        if (minNumber != Integer.MAX_VALUE) {
            System.out.println("Số nhỏ nhất trong mảng là: " + minNumber);
        } else {
            System.out.println("Mảng rỗng, không có số nhỏ nhất.");
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int linearSearchMin(int[] arr) {
        if (arr.length == 0) {
            return Integer.MAX_VALUE;  // Trả về giá trị Integer.MAX_VALUE nếu mảng rỗng
        }
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}


