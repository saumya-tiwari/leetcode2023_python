class Solution {
    public int maxSubArray(int[] nums) {
        
        int MAX_SUM = nums[0];
        
        int current_sum = MAX_SUM;
        
        for(int i = 1; i < nums.length; i++){
           current_sum = Math.max(nums[i] + current_sum, nums[i]);
            MAX_SUM = Math.max(current_sum, MAX_SUM);
           
        }
        
        return MAX_SUM;
        
    }
}