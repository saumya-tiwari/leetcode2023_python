class Solution {
    
    int[][] directions = {{0,1},{1,0},{-1,0},{0,-1}};
    
    public int numIslands(char[][] grid) {
        
        int count = 0;
        
        int m = grid.length;
        int n = grid[0].length;
        
        boolean[][] visited = new boolean[m][n];
        
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < m ; i++){
            for(int j  = 0; j < n; j++){
                if(grid[i][j] == '0' || visited[i][j]) continue;
                q.offer(new int[]{i,j});
                visited[i][j] = true;
                bfs(grid, q, visited);
                count++;
            }
        }
        
        return count;
        
    }
    
    void bfs(char[][] grid, Queue<int[]> q, boolean [][] visited){
        
        while(!q.isEmpty()){
            int[] point = q.poll();
            
            
            for(int[] dir: directions){
                int nr = point[0] + dir[0];
                int nc = point[1] + dir[1];
                
                if(nr < 0 || nr >= grid.length || nc < 0 || nc >= grid[0].length || grid[nr][nc] == '0' || visited[nr][nc]) continue;
                
                q.offer(new int[]{nr, nc});
                visited[nr][nc] = true;
            }
        }
    }
}