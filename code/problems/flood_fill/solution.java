class Solution {
    
    int[][] directions = new int[][]{{1,0},{0, 1,},{-1,0},{0, -1}};
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        
        Queue<int[]> q = new LinkedList<>();
        q.offer(new int[]{sr, sc});
        
        int oldColor = image[sr][sc];
        image[sr][sc] = color;
        
        while(!q.isEmpty()){
            
            int[] points = q.poll();
            
            for(int[] dir: directions){
                int nr = points[0] + dir[0];
                int nc = points[1] + dir[1];
                
                if(nr < 0 || nr >= image.length || nc < 0 || nc >= image[0].length || image[nr][nc] != oldColor) continue;
                
                image[nr][nc] = color;
                q.offer(new int[]{nr, nc});
            }
            
        }
        
        return image;
    }
    
  
}