import java.time.LocalDate;
import java.time.MonthDay;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Bai7 {
    public static void main(String[] args) {
        String chuoiNgayThang = "2023-10-04";

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        LocalDate ngayThang = LocalDate.parse(chuoiNgayThang, formatter);

        System.out.println("Ngày tháng: " + ngayThang);
    }
}
