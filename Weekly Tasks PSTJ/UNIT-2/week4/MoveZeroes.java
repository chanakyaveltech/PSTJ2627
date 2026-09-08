import java.util.*;

public class MoveZeroes {
    public void moveZeroes(int[] nums) {
        int insertPos = 0;
        for (int num : nums) {
            if (num != 0) nums[insertPos++] = num;
        }
        while (insertPos < nums.length) nums[insertPos++] = 0;
    }
    public static void main(String[] args) {
        int[] arr = {0, 1, 0, 3, 12};
        new MoveZeroes().moveZeroes(arr);
        System.out.println(Arrays.toString(arr));
    }
}