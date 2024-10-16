class Solution {
    public int rob(int[] nums) {
        int[] dp = new int[nums.length+1];
        Arrays.fill(dp,-1);
        return Robber(nums,0,dp);
    }
    int Robber(int[] arr, int i,int[]dp){
        if(i >= arr.length) return 0;
        if(dp[i] != -1) return dp[i];
        int rob = arr[i] + Robber(arr,i+2,dp);
        int donr = Robber(arr,i+1,dp);
        return dp[i] = Math.max(rob, donr);
    }
}