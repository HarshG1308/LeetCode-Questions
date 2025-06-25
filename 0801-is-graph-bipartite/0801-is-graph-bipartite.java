class Solution {
    class Pair{
        int vtx;
        int dis;
        public Pair(int vtx, int dis){
            this.vtx = vtx;
            this.dis = dis;
        }
    }
    public boolean isBipartite(int[][] graph) {
        Queue<Pair> q = new LinkedList<>();
        Map<Integer, Integer> vis = new HashMap<>();
        for(int i = 0; i < graph.length; i++){
            if(vis.containsKey(i)) continue;
            q.add(new Pair(i, 0));
            while(!q.isEmpty()){
                Pair r = q.poll();
                if(vis.containsKey(r.vtx)){
                    if(vis.get(r.vtx) != r.dis) return false;
                    continue;
                }
                vis.put(r.vtx, r.dis);
                for(int j : graph[r.vtx]){
                    if(!vis.containsKey(j)) q.add(new Pair(j, r.dis+1));
                }
            }
        }
        return true;
    }
}