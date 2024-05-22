class Solution {
    public int climbStairs(int n) {
        Integer[] dp = new Integer[n+1];
        return climbStairsHelper(n, dp);
    }
    public int climbStairsHelper(int n, Integer[] dp){
        if(dp[n] != null) return dp[n];
        if(n <= 1) return 1;
        dp[n] = climbStairsHelper(n-1, dp) + climbStairsHelper(n-2, dp);
        return dp[n];
    }
}