import java.time.LocalDate;
import java.util.Scanner;

public class JavaDateAndTime {
    public static String findDay(int month, int day, int year) {
        return LocalDate.of(year, month, day).getDayOfWeek().name();
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter MM DD YYYY:");
        if(in.hasNextInt()){
            System.out.println(findDay(in.nextInt(), in.nextInt(), in.nextInt()));
        }
        in.close();
    }
}