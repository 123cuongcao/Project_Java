public class Bai1 {
    public static void main(String[] args) {


        int[] myArray = {5, 12, 7, 1, 9, 3, 15, 8};

        System.out.print("Mảng số nguyên: ");
        printArray(myArray);

        int maxNumber = linearSearchMax(myArray);

        if (maxNumber != Integer.MIN_VALUE) {
            System.out.println("Số lớn nhất trong mảng là: " + maxNumber);
        } else {
            System.out.println("Mảng rỗng, không có số lớn nhất.");
        }
    }

    private static void printArray(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }

    private static int linearSearchMax(int[] arr) {
        if (arr.length == 0) {
            return Integer.MIN_VALUE;
        }
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }
}



