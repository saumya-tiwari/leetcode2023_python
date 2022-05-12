class Solution {
    public int[] productExceptSelf(int[] nums) {
        
        int[] output = new int[nums.length];
        
        int prefix = 1;
        for(int i  = 0; i < nums.length; i++){
            
            output[i] = prefix;
           prefix *= nums[i];
            
        }
        
        int postfix = 1;
          for(int i  = nums.length - 1; i >=0; i--){
            
            output[i] *= postfix;
            postfix *= nums[i];
            
        }
        
        return output;
        
    }
}