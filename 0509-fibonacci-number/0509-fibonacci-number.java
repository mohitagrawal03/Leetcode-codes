class Solution {
    public int fib(int n) {
        Integer dp[] = new Integer[n+1];
        return fibHelper(n, dp);
    }
    public int fibHelper(int n, Integer[] dp) {
        if(dp[n] != null) return dp[n];
        if(n == 0 || n == 1) return n;
        dp[n] = fibHelper(n-1, dp) + fibHelper(n-2, dp);
        return dp[n];
    }
}