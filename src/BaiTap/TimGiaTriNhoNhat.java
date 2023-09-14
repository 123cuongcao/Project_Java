package BaiTap;

public class TimGiaTriNhoNhat {
    public static int minValue(int[] array) {
        int minValue = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < minValue) {
                minValue = array[i];
            }
        }

        return minValue;
    }

    public static void main(String[] args) {
        int[] numbers = {4, 2, 9, 1, 5, 8};
        int min = minValue(numbers);
        System.out.println("Giá trị nhỏ nhất trong mảng là: " + min);
    }

}
