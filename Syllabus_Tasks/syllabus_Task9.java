import java.util.*;
import java.util.function.*;

public class task9 {

    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        String op = sc.next();
        int b = sc.nextInt();

        Predicate<Integer> test;

        if (op.equals("+")) {
            test = result -> result == add(a, b);
        } else {
            test = result -> result == divide(a, b);
        }

        int result;

        if (op.equals("+")) {
            result = add(a, b);
        } else {
            result = divide(a, b);
        }

        System.out.println(test.test(result)
                ? "Test Passed"
                : "Test Failed");

        sc.close();
    }
}
// output
// 20 + 10
// Test Passed