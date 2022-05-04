class Solution {
    public int maxOperations(int[] nums, int k) {
        
       // Map<Integer, Integer> map = new HashMap<>();
        
       int ans = 0;
        
        
      //  for(int i = 0; i < nums.length; i++){
            
           // int complement = k - nums[i];
            
           // if(map.containsKey(complement)){               
                //map.put(complement, map.getOrDefault(0) + 1);
          //      ans++;
          ///  }
            
           // map.put(complement, map.getOrDefault(complement, 0) + 1);
     //   }
        
        int i  = 0, j = nums.length -1;
        
        Arrays.sort(nums);
        
        while(i < j){
            if(nums[i] + nums[j] == k){
                ans++;
                i++;
                j--;
            }else if(nums[i] + nums[j] < k){
                i++;
            }else{
                j--;
            }
                
        }
        
        return ans;
        
    }
}