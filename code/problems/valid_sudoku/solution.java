class Solution {
    public boolean isValidSudoku(char[][] board) {
         Set<Character> miniBlock = new HashSet();
        Integer iCounter = 0, jCounter = 0;
        Integer[] startI = {0, 3, 6};
        Integer[] startJ = {0, 3, 6};
        Map<Integer, HashSet<Character>> rowsMap = new HashMap();
        Map<Integer, HashSet<Character>> colsMap = new HashMap();
        while(iCounter<=2) {
            for(int i=startI[iCounter];i<startI[iCounter] + 3;i++) {
                for(int j=startJ[jCounter];j<startJ[jCounter]+3;j++) {
                    if(miniBlock.contains(board[i][j]))
                        return false;
                    if(colsMap.get(i) != null && colsMap.get(i).contains(board[i][j]))
                        return false;
                    if(rowsMap.get(j) != null && rowsMap.get(j).contains(board[i][j]))
                        return false;
                    if(board[i][j] != '.') {
                        miniBlock.add(board[i][j]);
                        if(colsMap.get(i) == null)
                            colsMap.put(i, new HashSet<Character>());
                        HashSet<Character> currentSet = colsMap.get(i);
                        currentSet.add(board[i][j]);
                        colsMap.put(i,currentSet);
                        if(rowsMap.get(j) == null)
                            rowsMap.put(j, new HashSet<Character>());
                        currentSet = rowsMap.get(j);
                        currentSet.add(board[i][j]);
                        rowsMap.put(j,currentSet);
                    }
                }
            }
            miniBlock = new HashSet();
            jCounter++;
            if(jCounter > 2) {
                jCounter = 0;
                iCounter++;
            }
        }
        return true;
    }
}