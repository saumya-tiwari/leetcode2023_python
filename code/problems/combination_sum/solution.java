class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        
        backtrack(0, new ArrayList<>(), 0, target, candidates);
        return res;
        
    }
    
    
    public void backtrack(int index, List<Integer> list, int sum, int target, int[] candidates){
        
        if(index >= candidates.length || target < sum)
            return;
        
        if(sum == target){
            res.add(new ArrayList<>(list));
            return;
        }
        
        list.add(candidates[index]);
        backtrack(index, list, sum + candidates[index], target, candidates);
        
        list.remove(list.size() - 1);
        backtrack(index + 1, list, sum, target, candidates);
    }
}