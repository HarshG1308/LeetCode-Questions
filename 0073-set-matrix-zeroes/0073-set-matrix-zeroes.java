class Solution {
    public void setZeroes(int[][] matrix) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        
        // Arrays to keep track of rows and columns to be zeroed out
        boolean[] zeroRows = new boolean[rows];
        boolean[] zeroCols = new boolean[cols];
        
        // First pass to mark the rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (matrix[i][j] == 0) {
                    zeroRows[i] = true;
                    zeroCols[j] = true;
                }
            }
        }
        
        // Second pass to zero out the marked rows and columns
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (zeroRows[i] || zeroCols[j]) {
                    matrix[i][j] = 0;
                }
            }
        }
    }
}
