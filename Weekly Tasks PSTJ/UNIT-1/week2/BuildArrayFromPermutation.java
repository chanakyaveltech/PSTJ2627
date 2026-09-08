import java.util.Arrays;

public class BuildArrayFromPermutation {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length];
        for (int i = 0; i < nums.length; i++) ans[i] = nums[nums[i]];
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new BuildArrayFromPermutation().buildArray(new int[]{0,2,1,5,3,4})));
    }
}