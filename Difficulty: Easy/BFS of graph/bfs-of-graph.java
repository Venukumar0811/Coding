class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        int n = adj.size();
        
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean vis[] = new boolean[n];
        q.add(0);
        vis[0]=true;
        
        while(!q.isEmpty()){
            int node = q.poll();
            
            ans.add(node);
            
            for(int i : adj.get(node)){
                if(!vis[i]){
                    vis[i]=true;
                    q.add(i);
                }
            }
        }
        return ans;
    }
}