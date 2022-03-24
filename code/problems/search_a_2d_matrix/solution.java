class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        
        int r = matrix.length;
         if (r == 0)
            return false;
        
        int c = matrix[0].length;
                       
                       
        int left = 0; int right = (r * c) - 1;
                       
        while(left <= right){
            int mid = (left + right) / 2;
            
            if(target == matrix[mid / c][mid % c])
                return true;
            else if(target < matrix[mid / c][mid % c]){
                right = mid - 1;
            }else
                left = mid + 1;
                
        }
        
        return false;
        
    }
}