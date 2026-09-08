import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class NumberOfDaysBetweenTwoDates {
    public int daysBetweenDates(String date1, String date2) {
        return (int) Math.abs(ChronoUnit.DAYS.between(LocalDate.parse(date1), LocalDate.parse(date2)));
    }
    public static void main(String[] args) {
        System.out.println(new NumberOfDaysBetweenTwoDates().daysBetweenDates("2019-06-29", "2019-06-30"));
    }
}