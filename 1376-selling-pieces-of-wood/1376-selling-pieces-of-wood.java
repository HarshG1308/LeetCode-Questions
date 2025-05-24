class Solution {
    public long sellingWood(int m, int n, int[][] prices) {
        long[][] dp = new long[m + 1][n + 1];
        // step 1 : dp banao height width change ho rhi hein unka max price store karwao unke index par
        for(int[] i : prices){
            int h = i[0], w = i[1], p = i[2];
            dp[h][w] = Math.max(dp[h][w], p);;
        }
        // step 2 : horizontal and vertical cuts ke liye max value calculate karo
        for(int i = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                for(int k = 0; k < i; k++){
                    dp[i][j] = Math.max(dp[i][j], dp[k][j] + dp[i - k][j]);
                }
                for(int k = 0; k < j; k++){
                    dp[i][j] = Math.max(dp[i][j], dp[i][k] + dp[i][j - k]);
                }
            }
        }
        return dp[m][n];
    }
}