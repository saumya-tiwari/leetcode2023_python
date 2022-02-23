class Solution {
    public int maxSubArray(int[] nums) {
        
        if(nums.length == 1)
            return nums[0];
        
        int currentSubArray = nums[0];
        int maxSubArray = nums[0];
        
        for(int i = 1; i < nums.length ; i++){
            
            currentSubArray += nums[i];
            currentSubArray = Math.max(nums[i], currentSubArray);
            maxSubArray = Math.max(currentSubArray, maxSubArray);
        }
        
    return maxSubArray;
        
    }
}