import java.util.*;

public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        int leftDiag = 0, rightDiag = 0, n = arr.size();
        for (int i = 0; i < n; i++) {
            leftDiag += arr.get(i).get(i);
            rightDiag += arr.get(i).get(n - 1 - i);
        }
        return Math.abs(leftDiag - rightDiag);
    }
    public static void main(String[] args) {
        List<List<Integer>> mat = Arrays.asList(
            Arrays.asList(11, 2, 4),
            Arrays.asList(4, 5, 6),
            Arrays.asList(10, 8, -12)
        );
        System.out.println(diagonalDifference(mat));
    }
}