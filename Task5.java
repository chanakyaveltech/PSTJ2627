import java.util.Arrays;

public class Task5 {

    public static void main(String[] args) {

        int[] arr = {12,3,5,7,19};
        int k = 3;

        Arrays.sort(arr);

        System.out.println(k + "rd Smallest Element = " + arr[k-1]);
    }
}