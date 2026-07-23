import java.util.stream.IntStream;

public class Task6 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40};

        IntStream.range(0, arr.length)
                .forEach(i ->
                        IntStream.range(i + 1, arr.length)
                                .forEach(j ->
                                        System.out.println("(" + arr[i] + ", " + arr[j] + ")")));
    }
}