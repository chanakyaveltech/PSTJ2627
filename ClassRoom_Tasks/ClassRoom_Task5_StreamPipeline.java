package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class ClassRoom_Task5_StreamPipeline {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(12, 25, 30, 12, 45, 50, 25, 60);

        List<Integer> result = numbers.stream()
                .distinct()
                .filter(n -> n > 20)
                .map(n -> n * 2)
                .sorted()
                .collect(Collectors.toList());

        System.out.println(result);
    }
}
