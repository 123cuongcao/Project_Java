package src;

import java.util.Scanner;

public class Bai9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập số nguyên dương n: ");
            int n = scanner.nextInt();

            if (n <= 0) {
                System.out.println("Lỗi: Vui lòng nhập số nguyên dương.");
            } else {
                long result = calculateFibonacci(n);
                System.out.println("Fibonacci thứ " + n + " là: " + result);
            }
        } catch (Exception e) {
            System.out.println("Lỗi: Vui lòng nhập số nguyên dương.");
        } finally {
            scanner.close();
        }
    }

    private static long calculateFibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            long[] fib = new long[n + 1];
            fib[0] = 0;
            fib[1] = 1;

            for (int i = 2; i <= n; i++) {
                fib[i] = fib[i - 1] + fib[i - 2];
            }

            return fib[n];
        }
    }
}

