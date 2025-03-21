class Solution {
    public int uniquePathsWithObstacles(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;
        int[][] dp = new int[m][n];
        if(arr[0][0] == 1 || arr[m-1][n-1] == 1) return 0;
        for(int i = 0; i < m; i++){
            if(arr[i][0] == 1) break;
            dp[i][0] = 1;
        }
        for(int i = 0; i < n; i++){
            if(arr[0][i] == 1) break;
            dp[0][i] = 1;
        }

        for(int i = 1; i < m; i++){
            for(int j = 1; j < n; j++){
                if(arr[i][j] == 1){
                    dp[i][j] = 0;
                }
                else{
                    dp[i][j] = dp[i-1][j] + dp[i][j-1];
                }
            }
        }
        return dp[m-1][n-1];
    }
}
