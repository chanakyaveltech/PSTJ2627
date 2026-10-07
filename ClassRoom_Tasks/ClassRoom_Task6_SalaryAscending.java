package ClassRoom_Tasks;

import java.util.*;
import java.util.stream.*;

public class ClassRoom_Task6_SalaryAscending {
    public static void main(String[] args) {
        List<Employee> employees = Employee.sampleData();

        List<Employee> sorted = employees.stream()
                .sorted(Comparator.comparingDouble(e -> e.salary))
                .collect(Collectors.toList());

        sorted.forEach(System.out::println);
    }
}
