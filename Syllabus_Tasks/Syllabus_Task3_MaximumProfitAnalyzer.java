package Syllabus_Tasks;
import java.util.*;

public class Syllabus_Task3_MaximumProfitAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        int[] arr = Arrays.stream(sc.nextLine().trim().split("\\s+"))
                .mapToInt(Integer::parseInt)
                .toArray();

        int maxEndingHere = arr[0];
        int maxSoFar = arr[0];
        for (int i = 1; i < arr.length; i++) {
            maxEndingHere = Math.max(arr[i], maxEndingHere + arr[i]);
            maxSoFar = Math.max(maxSoFar, maxEndingHere);
        }

        System.out.println(maxSoFar);
    }
}
