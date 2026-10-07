package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class ClassRoom_Task8_DepartmentAlphabetical {
    public static void main(String[] args) {
        List<Employee> employees = Employee.sampleData();

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing(e -> e.department))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
