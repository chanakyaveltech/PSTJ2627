import java.util.Arrays;
public class Task3 {

    public static void main(String[] args) {

        int[] arr = {10,20,30,40,50,60};
        int key = 40;

        int index = Arrays.binarySearch(arr, key);

        if(index >= 0)
            System.out.println("Element found at index " + index);
        else
            System.out.println("Element not found");
    }
}