import java.util.OptionalInt;
import java.util.stream.IntStream;

public class Task2 {

    public static void main(String[] args) {

        int[] arr = {10, 20, 30, 40, 50};
        int index = 3;

        OptionalInt result = IntStream.range(0, arr.length)
                                      .filter(i -> i == index)
                                      .map(i -> arr[i])
                                      .findFirst();

        if (result.isPresent()) {
            System.out.println("Element at index " + index + " is: " + result.getAsInt());
        }
    }
}