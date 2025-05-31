class Solution {
    public int snakesAndLadders(int[][] board) {
        int n = board.length;
        int dest = n * n;
        boolean[] vis = new boolean[dest + 1];
        Queue<Integer> q = new LinkedList<>();
        int level = 0;
        q.offer(1);
        vis[1] = true;
        while (!q.isEmpty()) {
            int s = q.size();
            for (int i = 0; i < s; i++) {
                int r = q.poll();
                if (r == dest)
                    return level;
                for (int j = r + 1; j <= Math.min(r + 6, dest); ++j) {
                    int row = (j - 1) / n;
                    int col = (j - 1) % n;
                    if (row % 2 == 1)
                        col = n - 1 - col;
                    row = n - 1 - row;
                    int next = board[row][col] == -1 ? j : board[row][col];
                    if (!vis[next]) {
                        vis[next] = true;
                        q.offer(next);
                    }
                }
            }
            level++;
        }
        return -1;
    }
}