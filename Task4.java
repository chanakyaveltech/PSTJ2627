import java.util.Arrays;

public class Task4 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50};

        int max = Arrays.stream(arr)
                .max()
                .getAsInt();

        System.out.println("Maximum Element = " + max);
    }
}