class Solution {
   public int search(int[] nums, int target) {
        
        int res = searchValue(0, nums.length-1, target, nums);
        return res;
        
    }
    
    public int searchValue(int start, int end, int target, int[] nums){
        if(end >= start){
            int mid = start + (end - start)/ 2;
            if(target == nums[mid])
            return mid;
            if(target < nums[mid])
                return searchValue(start, mid - 1, target, nums);
            return searchValue(mid + 1, end, target, nums);
        }else
            return -1;
    }
}