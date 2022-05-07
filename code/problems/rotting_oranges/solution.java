class Solution {
    
    private static final int EMPTY = 0;
    private static final int FRESH = 1;
    private static final int ROTTEN = 2;
    
     private static final List<int[]> DIRECTIONS = Arrays.asList(
        new int[]{1, 0},
        new int[]{-1, 0},
        new int[]{0, 1},
        new int[]{0, -1}
    );
    
    public int orangesRotting(int[][] grid) {
        
        if(grid==null || grid.length == 0) return -1;
        
        Queue<Pair<Integer, Integer>> q = new LinkedList<>();
        
        int fresh = 0;
          int numberOfRows = grid.length, numberOfColumns = grid[0].length;
        
        for (int i  = 0; i < numberOfRows; i++){
            for(int j  = 0; j < numberOfColumns ; j++){
                if(grid[i][j] == ROTTEN)
                    q.offer(new Pair(i, j));
                else if(grid[i][j] == FRESH)
                    fresh++;
            }
        }
        
        int time = 0;
        
      
        
        while(!q.isEmpty() && fresh > 0){
            
          int size = q.size();        
          for(int i = 0; i < size; i++){   
            
            Pair<Integer, Integer> point = q.poll();
            
            int row = point.getKey();
            int col = point.getValue();
        
            for(int[] direction: DIRECTIONS){
                int r = direction[0] + row;
                int c = direction[1] + col;
                
                
                if(r < 0 || r >= numberOfRows || c < 0 || c >= numberOfColumns || grid[r][c] == 0 || grid[r][c] == 2)
                  continue;
                
                grid[r][c] = ROTTEN;
                q.add(new Pair(r, c));
                fresh--;            
                
            }
        }
            
        time++;
            
        }
        
        return fresh == 0 ? time : -1;
        
        
    }
}