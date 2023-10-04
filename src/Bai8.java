import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Bai8 {
    public static void main(String[] args) {
        LocalDate ngay1 = LocalDate.of(2023, 1, 1);

        LocalDate ngay2 = LocalDate.of(2023, 10, 4);

        long khoangCachNgay = ChronoUnit.DAYS.between(ngay1, ngay2);

        System.out.println("Khoảng cách giữa hai ngày là: " + khoangCachNgay + " ngày");
    }
}
