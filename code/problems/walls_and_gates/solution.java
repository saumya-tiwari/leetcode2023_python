class Solution {
    
    private static final int EMPTY = Integer.MAX_VALUE;
    private static final int GATE = 0;
    private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[]{1, 0},
        new int[]{-1, 0},
        new int[]{0, 1},
        new int[]{0, -1}
    );
    
    
    public void wallsAndGates(int[][] rooms) {
        Queue<int[]> q = new LinkedList<>();
        
        for(int i = 0; i < rooms.length; i++){
            for(int j = 0; j < rooms[i].length; j++){
                if(rooms[i][j] == GATE)
                   q.add(new int[]{i ,j});
            }
        }
        
        while(!q.isEmpty()){
            
            int[] point = q.poll();
            int row = point[0];
            int col = point[1];
            
            
            for(int[] direction: DIRECTIONS){
                int r = row + direction[0];
                int c = col + direction[1];
                
                if(r < 0 || r >= rooms.length || c < 0 || c >= rooms[0].length || rooms[r][c] != EMPTY){
                    continue;
                }
                
                rooms[r][c] = rooms[row][col] + 1;
                q.add(new int[]{r,c});
                
                
            }
            
        }
        
        
    }
}
    
 