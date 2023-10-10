package src;

public class Bai3 {
    public static void main(String[] args) {
        System.out.println("Mảng số nguyên ");
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        try {
            int sum = 0;
            for (int a : arr) {
                sum += a;
            }
        } catch (NumberFormatException e) {
            System.out.println("Mảng  có chứa số không phải số nguyên");
        }
    }
}
