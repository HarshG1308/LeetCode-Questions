class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination){
        boolean[] vis = new boolean[n]; 
        List<List<Integer>> adj = new ArrayList<>();
        for(int i= 0; i < n; i++) adj.add(new ArrayList<>());
        for(int[] i : edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        return dfs(adj, vis, source, destination);
    }
    boolean dfs(List<List<Integer>> adj, boolean[] vis, int src, int dest){
        if(src == dest) return true;
        vis[src] = true;
        boolean ans = false;
        for(int i : adj.get(src)){
            if(!vis[i]) ans = dfs(adj, vis, i, dest);
            if(ans) return true;
        }
        return false;
    }
}