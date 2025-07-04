class Solution {
    public int coinChange(int[] coins, int amount) {
        int[] dp = new int[amount+1];
        Arrays.fill(dp , -1);
        int ans = solve(coins, amount, dp);
        return ans == Integer.MAX_VALUE ? -1 : ans;
    }

    int solve(int[] coins, int total, int[] dp){
        if(total == 0) return 0;
        if(total < 0) return Integer.MAX_VALUE;
        if(dp[total] != -1) return dp[total];
        int min = Integer.MAX_VALUE;
        for(int i : coins){
            int ans = solve(coins, total - i, dp);
            if(ans != Integer.MAX_VALUE){
                min = Math.min(min, 1+ans);
            }
        }
        return dp[total] = min;
    }
}