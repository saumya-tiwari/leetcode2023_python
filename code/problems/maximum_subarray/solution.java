class Solution {
    public int maxSubArray(int[] nums) {
        
       int sum = 0;
       int max_sum = Integer.MIN_VALUE;
        
        if(nums.length == 1)
            return nums[0];
        
        for(int n: nums){
            sum += n;
            max_sum = Math.max(max_sum, sum);
            if(sum < 0)
                sum = 0;
        }
        
        
        return max_sum;
        
    }
}