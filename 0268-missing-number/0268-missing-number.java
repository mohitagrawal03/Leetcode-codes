class Solution {
    public int missingNumber(int[] nums) {
        //int n = nums.length;
        int s = (nums.length*(nums.length+1))/2; // sum of n natural nos.
        int sDash = 0;
        for(int i = 0; i < nums.length; i++){
            sDash += nums[i];
        }
        
        return s - sDash;
    }
}