class Solution {
    
    List<List<Integer>> subsets = new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        List<Integer> op = new ArrayList<>();
        Map<List<Integer>, Integer> map = new HashMap<>();
        Arrays.sort(nums);
        
        return findSubsets(nums, op, map);
        
    }
    
    public List<List<Integer>> findSubsets(int[] nums, List<Integer> op, Map<List<Integer>, Integer> nMap){
        
        if(nums.length == 0){
            if(!nMap.containsKey(op)){
               subsets.add(op);
               nMap.put(op, 1);
            }
            else{
                nMap.put(op, nMap.get(op) + 1);
            }
            return subsets;
        }
        
         List<Integer> op1 = new ArrayList<>(op);
         List<Integer> op2 = new ArrayList<>(op);
        
        op2.add(nums[0]);
        
        int[] tmp = Arrays.copyOfRange(nums, 1, nums.length);
        
        findSubsets(tmp, op1, nMap);
        findSubsets(tmp, op2, nMap);
        
        return subsets;
        
        
        
    }
}