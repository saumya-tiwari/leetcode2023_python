class Solution {
    public int[] sortedSquares(int[] nums) {
        int start = 0;
        int end = nums.length - 1;
        int i = end;
        
        int[] result = new int[nums.length];
        
        while(start <= end && i >= 0){
            if(Math.abs(nums[start]) < Math.abs(nums[end])){
                result[i--] = nums[end] * nums[end];
                end--;
            }else{
                result[i--] = nums[start] * nums[start];
                start++;
            }
        }
               
      return result;
    }
}