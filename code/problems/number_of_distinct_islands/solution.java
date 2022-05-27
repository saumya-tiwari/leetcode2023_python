class Solution {
    
    List<List<int[]>> distinctIslands = new ArrayList<>();
    int[][] grid;
    
    List<int[]> currentIsland = new ArrayList<>();
    boolean [][] seen;
    
    
    public int numDistinctIslands(int[][] grid) {
        
        this.grid = grid;
        seen = new boolean[grid.length][grid[0].length];
        
        for(int row  = 0; row < grid.length; row++){
            for(int col = 0; col < grid[0].length; col++){
                dfs(row, col);
                if(currentIsland.isEmpty())
                    continue;
                int mincol = grid[0].length - 1;
                for(int i  = 0; i < currentIsland.size(); i++){
                    mincol = Math.min(mincol, currentIsland.get(i)[1]);
                }
                
                for(int[] cell: currentIsland){
                    cell[0] -= row;
                    cell[1] -= mincol;
                }
                
                if(currentIslandIsUnique()){
                    distinctIslands.add(currentIsland);
                }
                
                currentIsland = new ArrayList<>();
                
            }
        }
        
        return distinctIslands.size();
    }
    
    private boolean currentIslandIsUnique(){
        for(List<int[]> otherIsland: distinctIslands){
            if(currentIsland.size() != otherIsland.size()) continue;
            
            if(equalIsland(currentIsland, otherIsland)) return false;
        }
        
        return true;
    }
    
    private boolean equalIsland(List<int[]> island1, List<int[]> island2){
        for(int i  = 0; i < island1.size(); i++){
            if(island1.get(i)[0] != island2.get(i)[0] || island1.get(i)[1] != island2.get(i)[1])
                return false;
        }
        
        return true;
    }
    
    
    private void dfs(int row, int col){
        if(row < 0 || col < 0 || row >= grid.length || col >= grid[0].length) return;
        
        if(seen[row][col] || grid[row][col] == 0) return;
        seen[row][col] = true;
        
        currentIsland.add(new int[]{row, col});
        dfs(row + 1, col);
        dfs(row - 1, col);
        dfs(row, col + 1);
        dfs(row, col - 1);
    }
}