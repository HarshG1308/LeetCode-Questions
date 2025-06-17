class Solution {
    class Node {
        int first;
        int second;
        int third; 
        Node(int _first, int _second, int _third) {
            this.first = _first; 
            this.second = _second; 
            this.third = _third; 
        }
    }
    public int[][] updateMatrix(int[][] mat) {
        int row = mat.length;
        int col = mat[0].length;

        int[][] dist = new int[row][col];
        int[][] vis = new int[row][col];
        Queue<Node> q = new LinkedList<Node>();

        for(int i = 0; i < row; i++){
            for(int j = 0; j < col; j++){
                if(mat[i][j] == 0){
                    vis[i][j] = 1;
                    q.add(new Node(i, j, 0));
                } else {
	                vis[i][j] = 0; 
	            }
            }
        }

        int[] r = {-1, 0, 1, 0};
        int[] c = {0, 1, 0, -1};

        while(!q.isEmpty()){
            int rown = q.peek().first;
            int coln = q.peek().second;
            int steps = q.peek().third;
            q.remove();
            dist[rown][coln] = steps;

            for(int i = 0; i < 4; i++){
                int nrow = rown + r[i];
                int ncol = coln + c[i];

                if((nrow >= 0 && nrow < row) && (ncol >= 0 && ncol < col && vis[nrow][ncol] == 0)) {
                    vis[nrow][ncol] = 1;
                    q.add(new Node(nrow, ncol, steps+1));
                }
            }
        }
        return dist;
    }
}