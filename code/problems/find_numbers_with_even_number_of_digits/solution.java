class Solution {
    public int findNumbers(int[] nums) {
        
        int numOfEvenDigits = 0;
        
        for(int i = 0; i < nums.length; i++){
            int noOfDigits = 0;
            while(nums[i] > 0){
                nums[i] = nums[i]/10;
                noOfDigits++;     
            }
            
            if(noOfDigits % 2 == 0)
                numOfEvenDigits++;
               
        }
        
        return numOfEvenDigits;
    }
}