class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
          int l = 0;
        int r = matrix.length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (matrix[mid][0] == target) return true;
            if (matrix[mid][0] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        
        int row = Math.max(0, l - 1);
        
        // locate col, find the col where tis first element >= target
        l = 0;
        r = matrix[0].length;
        while (l < r) {
            int mid = l + (r - l) / 2;
            if (matrix[row][mid] == target) return true;
            if (matrix[row][mid] > target) {
                r = mid;
            } else {
                l = mid + 1;
            }
        }
        
        if (l < matrix[0].length && matrix[row][l] == target) {
            return true;
        }
        
        return false;
    }
}