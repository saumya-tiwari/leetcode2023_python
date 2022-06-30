class Solution {
    public int[] sortArray(int[] nums) {
        
        if(nums.length <= 1){
            return nums;
        }
        
        int pivot = (0 + nums.length) / 2;
        
        int[] leftArr = sortArray(Arrays.copyOfRange(nums, 0, pivot));
        int[] rightArr = sortArray(Arrays.copyOfRange(nums, pivot, nums.length));
        
        return merge(leftArr, rightArr);
        
    }
    
    int[] merge(int[] lArr, int[] rArr){
        int[] result = new int[lArr.length + rArr.length];
        int lIndex = 0, rIndex = 0, rResIndex = 0;
        
        while(lIndex < lArr.length && rIndex < rArr.length){
            if(lArr[lIndex] < rArr[rIndex])
                result[rResIndex++] = lArr[lIndex++];
            else
                result[rResIndex++] = rArr[rIndex++];                        
        }
        
         while(lIndex < lArr.length){
            result[rResIndex++] = lArr[lIndex++];                       
        }
        
         while(rIndex < rArr.length){
            result[rResIndex++] = rArr[rIndex++];         
                
        }
        
        return result;
    }
}