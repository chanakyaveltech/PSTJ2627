import java.util.*;

public class MultiplyTheMatrices {
    public static int[][] multiplyMatrix(int A[][], int B[][]) {
        if (A[0].length != B.length) return new int[0][0]; // Cannot multiply
        int[][] C = new int[A.length][B[0].length];
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < B[0].length; j++) {
                for (int k = 0; k < A[0].length; k++) {
                    C[i][j] += A[i][k] * B[k][j];
                }
            }
        }
        return C;
    }
    public static void main(String[] args) {
        int[][] res = multiplyMatrix(new int[][]{{1,2},{3,4}}, new int[][]{{1,1},{1,1}});
        for (int[] row : res) System.out.println(Arrays.toString(row));
    }
}