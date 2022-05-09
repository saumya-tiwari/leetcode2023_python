class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsets(int[] nums) {
        
        //res.add(new ArrayList<>()); 
        List<Integer> curr = new ArrayList<>();
        backtrack(0, curr, nums);
        return res;
        
    }
    
    
    public void backtrack(int index, List<Integer> list, int[] nums){
        if(index >= nums.length){
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[index]);
        backtrack(index + 1, list, nums);
        
        list.remove(list.size() - 1);
        backtrack(index + 1, list, nums);
            //list.remove(i);     
       
    }
}