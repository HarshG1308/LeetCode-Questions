class Solution {
    public void setZeroes(int[][] matrix) {
        int r = matrix.length; int c = matrix[0].length;
        int[] rows = new int[r];
        int[] columns = new int[c];
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(matrix[i][j] == 0){
                    rows[i] = 1;
                    columns[j] = 1;
                }
            }
        }
        for(int i = 0; i < r; i++){
            for(int j = 0; j < c; j++){
                if(rows[i] == 1 || columns[j] == 1) matrix[i][j] = 0;
            }
        }
    }
}