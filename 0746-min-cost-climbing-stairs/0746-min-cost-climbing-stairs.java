class Solution {
    public int minCostClimbingStairs(int[] cost) {
//         Integer[] dp = new Integer[cost.length + 1];
        
//         dp[dp.length - 1] = 0;
//         dp[dp.length - 2] = cost[cost.length - 1];
        
//         for(int i = dp.length - 3; i >= 0; i--){
//             dp[i] = cost[i] + Math.min(dp[i+1], dp[i+2]);
//         }
        
//         return Math.min(dp[0], dp[1]);
        
        // Space Optimization from O(n) to O(1)
        
        int twoAhead = cost[cost.length-1];
        int oneAhead = cost[cost.length-2];
        int curr;
        for(int i = cost.length - 3; i >= 0; i--){
            curr = cost[i] + Math.min(oneAhead, twoAhead);
            twoAhead = oneAhead;
            oneAhead = curr;
        }
        return(Math.min(oneAhead, twoAhead));
    }
}