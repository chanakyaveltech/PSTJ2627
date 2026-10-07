package ClassRoom_Tasks;

import java.util.*;

public class Employee {
    String name;
    String department;
    double salary;

    Employee(String name, String department, double salary) {
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return name + " | " + department + " | " + salary;
    }

    static List<Employee> sampleData() {
        return new ArrayList<>(Arrays.asList(
                new Employee("Alice Johnson", "Engineering", 75000),
                new Employee("Bob Smith", "Marketing", 62000),
                new Employee("Charlie Brown", "Engineering", 90000),
                new Employee("Diana Prince", "Sales", 55000),
                new Employee("Evan Wright", "Finance", 71000),
                new Employee("Fiona Gallagher", "HR", 68000),
                new Employee("George Miller", "Marketing", 83000),
                new Employee("Hannah Lee", "Sales", 59000)));
    }
}
