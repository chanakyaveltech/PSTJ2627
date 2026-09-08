import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

public class DayOfTheWeek {
    public String dayOfTheWeek(int day, int month, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().getDisplayName(TextStyle.FULL, Locale.US);
    }
    public static void main(String[] args) {
        System.out.println(new DayOfTheWeek().dayOfTheWeek(31, 8, 2019));
    }
}