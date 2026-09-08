import java.util.*;

public class TransposeMatrix {
    public int[][] transpose(int[][] matrix) {
        int r = matrix.length, c = matrix[0].length;
        int[][] ans = new int[c][r];
        for (int i = 0; i < r; ++i) {
            for (int j = 0; j < c; ++j) ans[j][i] = matrix[i][j];
        }
        return ans;
    }
    public static void main(String[] args) {
        int[][] res = new TransposeMatrix().transpose(new int[][]{{1,2,3},{4,5,6},{7,8,9}});
        for (int[] row : res) System.out.println(Arrays.toString(row));
    }
}