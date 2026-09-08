import java.util.Arrays;

public class SortArrayByParity {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;
        while (left < right) {
            if (nums[left] % 2 > nums[right] % 2) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }
            if (nums[left] % 2 == 0) left++;
            if (nums[right] % 2 == 1) right--;
        }
        return nums;
    }
    public static void main(String[] args) {
        SortArrayByParity obj = new SortArrayByParity();
        System.out.println(Arrays.toString(obj.sortArrayByParity(new int[]{3, 1, 2, 4})));
    }
}