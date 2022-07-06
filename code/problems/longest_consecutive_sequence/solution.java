class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        int max = 0;
        
        Set<Integer> set = new HashSet<>();
        
        for(int n: nums)
            set.add(n);
        //int count = 0;
        
        for(int i = 0; i < nums.length; i++){
            
            int count = 1;
            
            int n = nums[i];
            
            while(set.contains(--n)){
                count++;
                set.remove(n);
            }
            
             n = nums[i];
            
            while(set.contains(++n)){
                count++;
                set.remove(n);
            }
            
            max = Math.max(max, count);
            
        }
        
        return max;
        
    }
}