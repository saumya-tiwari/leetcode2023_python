class Solution {
    public int[] searchRange(int[] nums, int target) {
        
        int firstOccurance = findFirstOccurance(nums, target);
        int lastOccurance = findLastOccurance(nums, target);
        
        return new int[]{firstOccurance, lastOccurance};
        
    }
    
    int findFirstOccurance(int[] nums, int target){
        int start = 0;
        int end = nums.length - 1;
        
        int result = -1;
        
        while(start <= end){
            int mid = (start + end) / 2;
            
            if(nums[mid] == target){
                result = mid;
                end = mid - 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return result;
    }
    
     int findLastOccurance(int[] nums, int target){
          int start = 0;
        int end = nums.length - 1;
        
        int result = -1;
        
        while(start <= end){
           int mid = (start + end) / 2;
            
            if(nums[mid] == target){
                result = mid;
                start = mid + 1;
            }else if(nums[mid] > target){
                end = mid - 1;
            }else{
                start = mid + 1;
            }
        }
        
        return result;
    }
}