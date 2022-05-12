class Solution {
    public boolean containsDuplicate(int[] nums) {
        
       Arrays.sort(nums);
        
        int i  = 0;
        int j  = 1;
        
        while(i < nums.length && j < nums.length ) {
            
            if(nums[i] == nums[j]){
               return true;
            }
             i++;
             j++;
        }
        
        return false;
        
    }
}