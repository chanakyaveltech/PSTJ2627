public class MaximumSubarrayCode {
    public int maxSubArray(int[] nums) {
        int max = nums[0], sum = nums[0];
        for (int i = 1; i < nums.length; i++) {
            sum = Math.max(nums[i], sum + nums[i]);
            max = Math.max(max, sum);
        }
        return max;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumSubarrayCode().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }
}