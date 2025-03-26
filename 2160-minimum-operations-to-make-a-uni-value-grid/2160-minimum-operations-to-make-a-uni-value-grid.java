class Solution {
    public int minOperations(int[][] grid, int x) {
        int r = grid.length, c = grid[0].length;
        int n = r * c;
        int[] arr = new int[n];
        int k = 0;
        for(int i = 0; i < r; i++){
            for(int j = 0;j < c; j++){
                arr[k++] = grid[i][j];
            }
        }

        Arrays.sort(arr);

        int diff = arr[0] % x;
        for(int i = 1; i < n; i++){
            if(arr[i] % x != diff) return -1;
        }

        int steps = 0;
        for(int i : arr) steps += Math.abs(arr[n/2] - i) / x;
        return steps;
    }
}