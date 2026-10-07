package ClassRoom_Tasks;

import java.util.*;

public class ClassRoom_Task4_CountStudentsAboveThreshold {
    public static void main(String[] args) {
        List<Integer> scores = Arrays.asList(75, 80, 65, 90, 85);

        long count = scores.stream()
                .filter(score -> score > 75)
                .count();

        System.out.println(count);
    }
}
