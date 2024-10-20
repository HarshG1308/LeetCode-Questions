class Solution {
    public int climbStairs(int n) {
       int p = paths(n, new int[n+1]);
       return p;
    }
    int paths(int n, int[] dp){
        if(n == 0) return 1;
        else if(n < 0) return 0;
        if(dp[n]!=0) return dp[n];
        int n1 = paths(n-1,dp);
        int n2 = paths(n-2, dp);
        int c = n1+n2;
        dp[n] = c;
        return c;
    }
}