class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        
        //Arrays.sort(nums);
        
        Map<Integer, Integer> map = new HashMap<>();
        
        for(int i  = 0; i < nums.length; i++){
           
           if(map.containsKey(nums[i])){
               if(Math.abs(map.get(nums[i]) - i) <= k)
                   return true;
               else
                   map.put(nums[i], i);
           }
            
            map.put(nums[i], i);
               
        }
        
        return false;
        
    }
}