class Solution {
    public int trap(int[] height) {
        
        int left = 0;
        int right = height.length - 1;
        
        int leftMax = 0;
        int rightMax = 0;
        
        int trappedWater = 0;
        
        while(left <= right){
            if(height[left] < height[right]){
                if(leftMax < height[left])
                    leftMax = height[left];
                else
                    trappedWater += leftMax - height[left];
                left++;
            }else{
                if(rightMax < height[right])
                    rightMax = height[right];
                else
                    trappedWater += rightMax - height[right];
                right -= 1;
            }
        }
        
        return trappedWater;
        
    }
}