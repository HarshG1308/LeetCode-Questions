class Solution {
    public int[][] onesMinusZeros(int[][] grid) {
        int n = grid.length;
        int m = grid[0].length;
        int[] row = new int[n];
        int[] col = new int[m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                if(grid[i][j] == 1){
                    row[i]++;
                    col[j]++;
                }
            }
        }
        int[][] ans = new int[n][m];
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                ans[i][j] = 2 * (row[i] + col[j]) - (m+n);
            }
        }
        return ans;
    }
}