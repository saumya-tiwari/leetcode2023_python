class Solution {
    List<List<Integer>> res = new ArrayList<>();
    
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        
        Arrays.sort(nums);
        
        Set<List<Integer>> set = new HashSet<>();
        List<Integer> list = new ArrayList<>();
        backtrack(0, list, nums, set);
        return new ArrayList<>(set);      
        
    }
    
    public void backtrack(int index, List<Integer> list, int[] nums, Set<List<Integer>> set){
        
        if(index >= nums.length){
            set.add(new ArrayList<>(list));
            return;
        }
        
        list.add(nums[index]);
        Collections.sort(list);
        backtrack(index + 1, list, nums, set);
        
        list.remove(list.size() - 1);
        Collections.sort(list);
        backtrack(index + 1, list, nums, set);
    }
}