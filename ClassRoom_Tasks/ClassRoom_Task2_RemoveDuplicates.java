package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class ClassRoom_Task2_RemoveDuplicates {
    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 20, 20, 30, 40, 40);

        List<Integer> unique = numbers.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(unique);
    }
}
