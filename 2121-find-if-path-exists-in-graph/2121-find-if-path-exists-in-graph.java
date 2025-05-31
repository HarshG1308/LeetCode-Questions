import java.util.*;

class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < n; i++) adj.add(new ArrayList<>());

        for(int[] edge : edges){
            adj.get(edge[0]).add(edge[1]);
            adj.get(edge[1]).add(edge[0]);
        }

        boolean[] vis = new boolean[n];
        return dfs(source, destination, adj, vis);
    }

    private boolean dfs(int node, int destination, List<List<Integer>> adj, boolean[] vis){
        if(node == destination) return true;

        vis[node] = true;
        for(int neighbor : adj.get(node)){
            if(!vis[neighbor]){
                if(dfs(neighbor, destination, adj, vis)) return true;
            }
        }
        return false;
    }
}
