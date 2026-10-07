package Syllabus_Tasks;

import java.util.*;
import java.util.stream.*;

public class Syllabus_Task1_SalaryTransformation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] salaries = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        String result = Arrays.stream(salaries)
                .mapToObj(s -> String.valueOf(Math.round(s * 1.1)))
                .collect(Collectors.joining(" "));

        System.out.println(result);
    }
}
