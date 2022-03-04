class Solution {
    public int missingNumber(int[] nums) {
        int len = nums.length;
        
     
        int sum = 0;
      
        
        for(int i  = 0 ; i < len; i++){
            
            sum += nums[i];
        
        }
        
        int total_sum = (nums.length * (nums.length + 1))/2;
        
        return (total_sum - sum);
    }
}