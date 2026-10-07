package Syllabus_Tasks;
import java.util.*;
import java.util.stream.*;

public class Syllabus_Task2_StreamAnalyticsEngine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        List<String[]> readings = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            readings.add(sc.nextLine().trim().split("\\s+"));
        }

        Map<String, Double> averages = readings.stream()
                .filter(r -> Double.parseDouble(r[1]) > 50)
                .collect(Collectors.groupingBy(
                        r -> r[0],
                        LinkedHashMap::new,
                        Collectors.averagingDouble(r -> Double.parseDouble(r[1]))));

        averages.entrySet().stream()
                .sorted((a, b) -> Double.compare(b.getValue(), a.getValue()))
                .forEach(e -> System.out.println(e.getKey() + " " + e.getValue()));
    }
}
