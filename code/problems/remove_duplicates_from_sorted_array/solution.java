class Solution {
    public int removeDuplicates(int[] nums) {
        
        
       int i  = 0;
       int j = 1;
        
        int cnt = 0;
        
        
       while(i < nums.length && j < nums.length){
           if(nums[i] == nums[j]){
               j++;
           }else{
               nums[++i] = nums[j++];
               cnt++;
           }
       }
        
        return cnt + 1;
        
        
        
    }
}