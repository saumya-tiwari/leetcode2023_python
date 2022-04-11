class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        
        int numCols = grid[0].length;
        int numRows = grid.length;
        
        List<List<Integer>> newGrid = new ArrayList<>();
        
        for(int i = 0; i < numRows; i++){
            List<Integer> newRow = new ArrayList<>();
            newGrid.add(newRow);
            for(int j = 0; j < numCols; j++){
                newRow.add(0);
            }
        }
        
        for(int row = 0; row < numRows; row++){
            for(int col = 0; col < numCols; col++){
                int new_col = (col + k) % numCols;
                int wrapAround = (col + k) / numCols;
                int newRow = (row + wrapAround) % numRows;
                newGrid.get(newRow).set(new_col, grid[row][col]);
            }
        }
        
        return newGrid;
        
    }
}