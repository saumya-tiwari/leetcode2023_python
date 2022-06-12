class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        
        int current  = 0;
        int max_sum = 0;
        
        HashSet<Integer> set = new HashSet<>();
        
        int left = 0;
        
        for(int right  = 0; right < nums.length; right++){
            
            while(set.contains(nums[right])){
                set.remove(nums[left]);
                current -= nums[left++];
            }
            
            
            set.add(nums[right]);
            current += nums[right];
            max_sum = Math.max(max_sum, current);
        }
        
        return max_sum;
        
    }
}