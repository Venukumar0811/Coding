class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        Map<Integer, Set<Integer>> adj = new HashMap<>();
        for(int[] ed: edges){
            adj.computeIfAbsent(ed[0],k->new HashSet<>()).add(ed[1]);
        }
        boolean[] visited = new boolean[V];
        boolean[] path = new boolean[V];
        
        for(int i=0;i<V;i++){
            if(!visited[i]){
                boolean hasCycle = dfs(i, adj, visited, path);
                if(hasCycle) return true;
            }
        }
        
        return false;
    }
    private boolean dfs(int idx,Map<Integer, Set<Integer>> adj,
        boolean[] vis, boolean[] path){
        vis[idx] = true;
        path[idx] = true;
        
        if(adj.containsKey(idx) && !adj.get(idx).isEmpty())
            for (int nei : adj.getOrDefault(idx, new HashSet<>())) {
                if (!vis[nei]) {
                    if (dfs(nei, adj, vis, path)) {
                        return true;
                    }
                } else if (path[nei]) {
                    return true;
                }
            }

        
        path[idx] = false;
        return false;
    }
}