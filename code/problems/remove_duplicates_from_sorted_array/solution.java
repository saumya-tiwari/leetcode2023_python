class Solution {
    public int removeDuplicates(int[] nums) {
        
        int i = 0;
        int j = 1;
        
        int len = nums.length - 1;
        
        while(j <= len && i <= len){
            if(nums[i] == nums[j]){
                j++;
            }else{
                nums[i + 1] = nums[j];
                i++;
                j++;
            }
        }
        
        return i + 1;
        
    }
}