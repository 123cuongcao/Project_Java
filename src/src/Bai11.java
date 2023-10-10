package src;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Bai11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Nhập ngày tháng năm (dd/MM/yyyy): ");
            String inputDate = scanner.nextLine();

            if (!isValidDate(inputDate)) {
                throw new IllegalArgumentException("Lỗi: Ngày tháng năm không hợp lệ.");
            }

            System.out.println("Ngày tháng năm hợp lệ.");
        } catch (Exception e) {
            System.out.println("Lỗi: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }

    private static boolean isValidDate(String inputDate) {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        dateFormat.setLenient(false);

        try {
            Date date = dateFormat.parse(inputDate);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }
}
