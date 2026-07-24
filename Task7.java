import java.util.stream.IntStream;

public class Task7 {

    public static void main(String[] args) {

        int number = 123456;

        int evenSum = String.valueOf(number)
                .chars()
                .map(c -> c - '0')
                .filter(n -> n % 2 == 0)
                .sum();

        int oddSum = String.valueOf(number)
                .chars()
                .map(c -> c - '0')
                .filter(n -> n % 2 != 0)
                .sum();

        System.out.println("Even Digit Sum = " + evenSum);
        System.out.println("Odd Digit Sum = " + oddSum);
    }
}