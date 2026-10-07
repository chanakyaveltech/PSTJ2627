package ClassRoom_Tasks;

import java.util.*;

public class ClassRoom_Task3_CalculateAverage {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(75, 80, 65, 90, 85);

        double average = scores.stream()
                .mapToInt(Integer::intValue)
                .average()
                .orElse(0);

        System.out.println(average);
    }
}
