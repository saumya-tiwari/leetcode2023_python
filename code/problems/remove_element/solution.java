class Solution {
    public int removeElement(int[] nums, int value) {
        int i = 0;
    
        int len = nums.length;
        
        if(nums.length == 0)
            return 0;
    
        
        while(i < len){
            if(nums[i] == value){
               nums[i] = nums[len - 1];
               len--;
            }else
            i++;
        }
        
        return len;
    }

}