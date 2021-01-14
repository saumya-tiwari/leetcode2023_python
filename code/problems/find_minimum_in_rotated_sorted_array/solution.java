class Solution {
    public int findMin(int[] nums) {
        
        int start = 0;
        int end = nums.length - 1;
        int N = nums.length;
        
        if(nums[start] <= nums[end])
            return nums[start];
                
        while(start <= end){
            int mid = (start + end) / 2;
            
            int prev = (mid + N - 1) % N;
            int next = (mid + 1) % N;
            
            if(nums[mid] <= nums[prev] && nums[mid] <= nums[next])
                return nums[mid];
            else if(nums[mid] >= nums[end])
                start = mid + 1;
            else
                end = mid - 1;
        }
        
        return -1;
        
    }
}