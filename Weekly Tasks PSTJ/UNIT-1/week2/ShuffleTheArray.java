import java.util.Arrays;

public class ShuffleTheArray {
    public int[] shuffle(int[] nums, int n) {
        int[] res = new int[2 * n];
        for (int i = 0; i < n; i++) {
            res[2 * i] = nums[i];
            res[2 * i + 1] = nums[i + n];
        }
        return res;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ShuffleTheArray().shuffle(new int[]{2,5,1,3,4,7}, 3)));
    }
}