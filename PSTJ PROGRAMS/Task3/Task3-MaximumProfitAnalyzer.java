import java.util.Scanner;
public class MaximumProfitAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        if (!scanner.hasNextInt()) {
            return;
        }
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        long maxSoFar = arr[0];
        long currentMax = arr[0];
        for (int i = 1; i < n; i++) {
            currentMax = Math.max((long) arr[i], currentMax + arr[i]);
            maxSoFar = Math.max(maxSoFar, currentMax);
        }
        System.out.println(maxSoFar);
        scanner.close();
    }
}