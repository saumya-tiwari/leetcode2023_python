class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        HashMap<Integer, Integer> map = new HashMap<>();
        
       // List<Integer> list = new ArrayList<>();
        
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());
        
        int[] arr = new int[2];
        
        
        
        
        for(int i = 0; i < nums.length; i++){
            
            int diff = target - nums[i];
            System.out.println(diff);
            
            if(list.indexOf(diff) != i && list.contains(diff)){
                 arr[0] = i;
                 arr[1] = list.indexOf(diff);
                 return arr;
            }
            
         
        }
     return arr;
        
    }
}