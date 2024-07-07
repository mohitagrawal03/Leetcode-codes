class Solution {
    public int findMin(int[] nums) {
        int l = 0, h = nums.length-1;
        int m = (l+h)/2;
        
        Integer min = Integer.MAX_VALUE;
        
        while (l <= h) {
            m = (l+h)/2;
            if (nums[m] < min) {
                min = nums[m];
            }
            if (nums[l] <= nums[m]) {
                min = Math.min(nums[l], min);
                l = m+1;
            } else {
                h = m-1;
            }
        }
        
        return min;
    }
}