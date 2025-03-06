class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        int n = grid.length;
        int[] counts = new int[n * n + 1];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                counts[grid[i][j]]++;
            }
        }
        int repeated = -1;
        int missing = -1;
        for (int i = 1; i <= n * n; i++) {
            if (counts[i] == 2) {
                repeated = i;
            } else if (counts[i] == 0) {
                missing = i;
            }
        }
        return new int[]{repeated, missing};
    }
}