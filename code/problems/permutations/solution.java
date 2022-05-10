class Solution {
     List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> permute(int[] nums) {
        
        if(nums.length == 0)
            return res;
        
        backtrack( new ArrayList<Integer>(), nums);
        return res;
    }
    
    public void backtrack( List<Integer> list, int[] nums){
        if(list.size() == nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        for(int n: nums){
            
            if(list.contains(n)) continue;
            
            list.add(n);
            backtrack(list, nums);
            
            list.remove(list.size() - 1);
        }
        
    }
}