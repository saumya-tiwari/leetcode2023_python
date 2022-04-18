class Solution {
    
    Map<Integer, Integer> cache = new HashMap<>();
    int[] nums;
    public int rob(int[] nums) {
        this.nums = nums;
        return dp(nums.length - 1);
    }
    
    public int dp(int i){
       
        if(i == 0)
            return nums[i];
        if( i == 1){
            return Math.max(nums[i], nums[i - 1]);
        }
        
        if(!cache.containsKey(i))
            cache.put(i, Math.max(dp(i - 1) , dp(i - 2) + nums[i]));
        
        return cache.get(i);
    }
}