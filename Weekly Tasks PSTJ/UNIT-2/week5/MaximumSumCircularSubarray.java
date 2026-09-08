public class MaximumSumCircularSubarray {
    public int maxSubarraySumCircular(int[] nums) {
        int totalSum = 0, currMax = 0, maxSum = nums[0], currMin = 0, minSum = nums[0];
        for (int n : nums) {
            currMax = Math.max(currMax + n, n);
            maxSum = Math.max(maxSum, currMax);
            currMin = Math.min(currMin + n, n);
            minSum = Math.min(minSum, currMin);
            totalSum += n;
        }
        return maxSum > 0 ? Math.max(maxSum, totalSum - minSum) : maxSum;
    }
    public static void main(String[] args) {
        System.out.println(new MaximumSumCircularSubarray().maxSubarraySumCircular(new int[]{5,-3,5}));
    }
}