class Solution {
    public int maxSubArray(int[] nums) {
        // Kadane's Algo
        int sum = 0, max = nums[0];
        
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            max = Math.max(max, sum);
            if (sum < 0) sum = 0;
        }
        
        return max;
    }
}