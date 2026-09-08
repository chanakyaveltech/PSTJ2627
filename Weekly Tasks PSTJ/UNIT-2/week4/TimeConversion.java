import java.util.*;

public class TimeConversion {
    public static String timeConversion(String s) {
        String amPm = s.substring(8);
        int hour = Integer.parseInt(s.substring(0, 2));
        String rest = s.substring(2, 8);
        if (amPm.equals("AM") && hour == 12) hour = 0;
        else if (amPm.equals("PM") && hour < 12) hour += 12;
        return String.format("%02d%s", hour, rest);
    }
    public static void main(String[] args) {
        System.out.println(timeConversion("07:05:45PM"));
    }
}