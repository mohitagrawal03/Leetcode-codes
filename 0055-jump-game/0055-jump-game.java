class Solution {
    public boolean canJump(int[] nums) {
        Boolean[] dp = new Boolean[nums.length];
        dp[dp.length - 1] = true;
        for(int i = dp.length - 2; i >= 0; i--){
            for(int j = 1; j <= nums[i] && i+j < dp.length; j++){
                if(dp[i+j] == true){
                    dp[i] = true;
                    break;
                }
            }
            if(dp[i] == null){
                dp[i] = false;
            }
        }
        return dp[0];
    }
}