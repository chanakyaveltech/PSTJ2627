package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class ClassRoom_Task7_SalaryDescending {
    public static void main(String[] args) {
        List<Employee> employees = Employee.sampleData();

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble((Employee e) -> e.salary).reversed())
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
