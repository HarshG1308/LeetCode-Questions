class Solution {
    public int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int[] memo = new int[n+1];
        Arrays.fill(memo, -1);
        return Math.min(solve(cost, n-1, memo), solve(cost, n-2, memo));
    }

    int solve(int[] cost, int n, int[] memo){
        if(n == 1 || n  == 0) return cost[n];
        else if(n < 0) return 0;
        if(memo[n] != -1) return memo[n];
        return memo[n] = cost[n] + Math.min(solve(cost, n-1, memo), solve(cost, n -2, memo));
    }
}