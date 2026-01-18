
https://www.geeksforgeeks.org/problems/bfs-traversal-of-graph/1

class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res = new ArrayList<>();
        int v = adj.size();
        boolean vis[]  = new boolean[v];
        
        int source = 0;
        Queue<Integer> q = new LinkedList<>();
        vis[source] = true;
        q.add(source);
        
        while(!q.isEmpty()){
            int curr = q.poll();
            res.add(curr);
            
            for(int x : adj.get(curr)){
            if(!vis[x]){
                vis[x] = true;
                q.add(x);
            }
            }
            
        }
        return res;
    }
}
