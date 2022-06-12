class Solution {
    public int minOperations(int[] nums, int x) {
        
        int current  = 0;
        
        for(int num : nums)
            current += num;
        
        int left = 0;
        int mini = Integer.MAX_VALUE;
        
        int n = nums.length;
        
        for(int right = 0; right < nums.length; right++ ){
            current -= nums[right];
            
            while(current < x && left <= right){
                current += nums[left];
                left++;
            }
            
            if(current == x){
                mini = Math.min(mini, (n - 1 - right) + left);
            }
        }
        
        return mini != Integer.MAX_VALUE ? mini: -1;
        
    }
}