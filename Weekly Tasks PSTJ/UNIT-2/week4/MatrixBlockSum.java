import java.util.*;

public class MatrixBlockSum {
    public int[][] matrixBlockSum(int[][] mat, int k) {
        int m = mat.length, n = mat[0].length;
        int[][] sum = new int[m + 1][n + 1];
        for (int r = 1; r <= m; r++) {
            for (int c = 1; c <= n; c++) {
                sum[r][c] = mat[r - 1][c - 1] + sum[r - 1][c] + sum[r][c - 1] - sum[r - 1][c - 1];
            }
        }
        int[][] ans = new int[m][n];
        for (int r = 0; r < m; r++) {
            for (int c = 0; c < n; c++) {
                int r1 = Math.max(0, r - k), c1 = Math.max(0, c - k);
                int r2 = Math.min(m - 1, r + k), c2 = Math.min(n - 1, c + k);
                ans[r][c] = sum[r2 + 1][c2 + 1] - sum[r1][c2 + 1] - sum[r2 + 1][c1] + sum[r1][c1];
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] res = new MatrixBlockSum().matrixBlockSum(new int[][]{{1,2,3},{4,5,6},{7,8,9}}, 1);
        for(int[] row : res) System.out.println(Arrays.toString(row));
    }
}