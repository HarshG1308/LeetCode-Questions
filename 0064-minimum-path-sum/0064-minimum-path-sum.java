class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;
        int[][] memo = new int[m][n];
        for (int[] row : memo) {
            Arrays.fill(row, -1);
        }
        return fn(grid, m - 1, n - 1, memo);
    }
    
    int fn(int[][] grid, int m, int n, int[][] memo) {
        if (m < 0 || n < 0) return Integer.MAX_VALUE; 
        if (m == 0 && n == 0) return grid[0][0]; 
        if (memo[m][n] != -1) return memo[m][n]; 
        int up = fn(grid, m - 1, n, memo);
        int left = fn(grid, m, n - 1, memo);
        memo[m][n] = Math.min(up, left) + grid[m][n];
        return memo[m][n];
    }
}