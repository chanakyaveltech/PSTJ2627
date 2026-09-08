import java.util.*;

public class Grading {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        List<Integer> res = new ArrayList<>();
        for (int g : grades) {
            if (g < 38) {
                res.add(g);
            } else {
                int nextMultipleOf5 = ((g / 5) + 1) * 5;
                if (nextMultipleOf5 - g < 3) {
                    res.add(nextMultipleOf5);
                } else {
                    res.add(g);
                }
            }
        }
        return res;
    }

    public static void main(String[] args) {
        List<Integer> grades = Arrays.asList(73, 67, 38, 33);
        System.out.println("Adjusted Grades: " + gradingStudents(grades));
    }
}