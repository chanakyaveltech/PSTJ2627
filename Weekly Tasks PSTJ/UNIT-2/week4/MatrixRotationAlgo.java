import java.util.*;

public class MatrixRotationAlgo {
    public static void matrixRotation(List<List<Integer>> matrix, int r) {
        int m = matrix.size(), n = matrix.get(0).size();
        int layers = Math.min(m, n) / 2;
        int[][] mat = new int[m][n];
        for (int i = 0; i < m; i++) for (int j = 0; j < n; j++) mat[i][j] = matrix.get(i).get(j);

        for (int layer = 0; layer < layers; layer++) {
            List<Integer> list = new ArrayList<>();
            for (int i = layer; i < n - layer; i++) list.add(mat[layer][i]);
            for (int i = layer + 1; i < m - layer; i++) list.add(mat[i][n - 1 - layer]);
            for (int i = n - 2 - layer; i >= layer; i--) list.add(mat[m - 1 - layer][i]);
            for (int i = m - 2 - layer; i > layer; i--) list.add(mat[i][layer]);
            
            int shift = r % list.size();
            Collections.rotate(list, -shift);
            
            int idx = 0;
            for (int i = layer; i < n - layer; i++) mat[layer][i] = list.get(idx++);
            for (int i = layer + 1; i < m - layer; i++) mat[i][n - 1 - layer] = list.get(idx++);
            for (int i = n - 2 - layer; i >= layer; i--) mat[m - 1 - layer][i] = list.get(idx++);
            for (int i = m - 2 - layer; i > layer; i--) mat[i][layer] = list.get(idx++);
        }
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) System.out.print(mat[i][j] + " ");
            System.out.println();
        }
    }
    public static void main(String[] args) {
        List<List<Integer>> mat = Arrays.asList(Arrays.asList(1,2,3,4), Arrays.asList(5,6,7,8),
                                                Arrays.asList(9,10,11,12), Arrays.asList(13,14,15,16));
        matrixRotation(mat, 2);
    }
}