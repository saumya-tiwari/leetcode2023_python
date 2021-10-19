class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {
        if (mat.length*mat[0].length != r*c) {
            return mat; // if number of elements in matrix != resultant matrix (i.e. number of rows*numbers of cols of resultant matrix ) then return original matrix
        }
        int res[][] = new int[r][c]; // resultant matrix array
        int m = 0; // initial position i.e. row and col at [0,0]
        int n = 0;
        
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (n == c) { // we reached max col in row, now we need to move to next row so m++
                    m++;
                    n = 0; // reset to 0 so to start with first column of next row (i.e. like [2,0])
                }
                res[m][n++] = mat[i][j]; // put values in resulant matrix and increment column index also
            }
        }
        return res;
    }
}