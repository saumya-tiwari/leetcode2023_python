class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        
        int noOfOnes = 0;
        int tempCnt = 0;
        for(int i = 0; i < nums.length ; i ++){
            if(nums[i] == 1){
                noOfOnes++;
                tempCnt = Math.max(noOfOnes,tempCnt);
            }                
            else
                noOfOnes = 0;
        }
        
        return tempCnt;
    }
}