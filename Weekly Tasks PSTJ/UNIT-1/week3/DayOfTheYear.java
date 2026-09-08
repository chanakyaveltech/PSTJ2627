import java.time.LocalDate;

public class DayOfTheYear {
    public int dayOfYear(String date) {
        return LocalDate.parse(date).getDayOfYear();
    }
    public static void main(String[] args) {
        System.out.println(new DayOfTheYear().dayOfYear("2019-01-09"));
    }
}