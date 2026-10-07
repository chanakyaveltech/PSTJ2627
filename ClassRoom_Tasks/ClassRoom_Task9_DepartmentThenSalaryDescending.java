package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class ClassRoom_Task9_DepartmentThenSalaryDescending {
    public static void main(String[] args) {
        List<Employee> employees = Employee.sampleData();

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparing((Employee e) -> e.department)
                        .thenComparing(Comparator.comparingDouble((Employee e) -> e.salary).reversed()))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
