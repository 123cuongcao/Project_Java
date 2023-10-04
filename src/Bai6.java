import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hãy nhập năm sinh");
        int year = Integer.parseInt(sc.nextLine());
        LocalDate born = LocalDate.of(year,1,1);
        LocalDate local = LocalDate.now();
        Period age = Period.between(born,local);
        System.out.println(age.getYears());
    }
}
