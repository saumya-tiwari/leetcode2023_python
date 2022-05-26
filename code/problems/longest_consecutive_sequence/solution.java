class Solution {
    public int longestConsecutive(int[] nums) {
        
        if(nums.length == 0)
            return 0;
        
        Arrays.sort(nums);
        
        for(int n: nums)
        System.out.print(n+" ");
        
        int count = 1;
        int maxStreak = 1;
        
        for(int i  = 1; i < nums.length; i++){
            if((nums[i] - nums[i - 1]) == 1)
                count++;
            else if((nums[i] - nums[i - 1]) > 1){
                
                 maxStreak = Math.max(maxStreak, count);
                 count = 1;
            }
               
        }
        
        return Math.max(maxStreak, count);
        
    }
}