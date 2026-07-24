import java.util.stream.Stream;

public class Task8 {

    public static void main(String[] args) {

        int n = 10;

        int fib = Stream.iterate(new int[]{0,1},
                a -> new int[]{a[1], a[0]+a[1]})
                .limit(n + 1)
                .reduce((first, second) -> second)
                .get()[0];

        System.out.println("Fibonacci = " + fib);
    }
}