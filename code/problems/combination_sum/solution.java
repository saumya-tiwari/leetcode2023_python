class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {

        List<List<Integer>> ans = new ArrayList<>();

        findCombination(0,candidates, target, ans, new ArrayList<Integer>());
        
        for(List<Integer> list :ans  ){
            for(int ltr : list){
                System.out.print(ltr);
            }

             System.out.println("");
        }
        return ans;
    }
        
    
    

     void findCombination(int index, int[] candidates, int target, List<List<Integer>> list, ArrayList<Integer> ls){
        // List<Integer> ls = new ArrayList<>();
         if(index == candidates.length){
             if(target == 0){
                 list.add(new ArrayList<Integer>(ls));
             }
             return;
         }

         if(candidates[index] <= target){
             ls.add(candidates[index]);
             findCombination(index, candidates, target - candidates[index], list, ls);
             ls.remove(ls.size() - 1);
         }

         findCombination(index + 1, candidates, target, list, ls);

     }
}