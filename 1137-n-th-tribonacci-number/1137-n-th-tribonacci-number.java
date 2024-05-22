class Solution {
    public int tribonacci(int n) {
        Integer[] dp = new Integer[n+1];
        return tribonacciHelper(n, dp);
    }
    public int tribonacciHelper(int n, Integer[] dp) {
        if(dp[n] != null) return dp[n];
        if(n == 0 || n == 1) return n;
        if(n == 2) return 1;
        
        dp[n] = tribonacciHelper(n-3, dp) + tribonacciHelper(n-2, dp) + tribonacciHelper(n-1, dp);
        return dp[n];
    }
}