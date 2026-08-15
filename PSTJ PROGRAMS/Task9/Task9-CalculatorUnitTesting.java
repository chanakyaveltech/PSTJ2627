import java.util.Scanner;
class Calculator {
    public int add(int a, int b) {
        return a + b;
    }
    public double divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }
        return (double) a / b;
    }
}
public class CalculatorUnitTesting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int num1 = scanner.nextInt();
        String operator = scanner.next();
        int num2 = scanner.nextInt();
        Calculator calculator = new Calculator();
        boolean passed = false;
        try {
            if (operator.equals("+")) {
                int result = calculator.add(num1, num2);
                passed = (result == (num1 + num2));
            } else if (operator.equals("/")) {
                double result = calculator.divide(num1, num2);
                passed = (result == ((double) num1 / num2));
            }
            if (passed) {
                System.out.println("Test Passed");
            } else {
                System.out.println("Test Failed");
            }
        } catch (Exception e) {
            System.out.println("Test Failed");
        }
        scanner.close();
    }
}