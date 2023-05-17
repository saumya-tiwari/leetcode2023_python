class Solution {
    public List<List<Integer>> combine(int n, int k) {

        List<List<Integer>> ans = new ArrayList<>();
        findcomb(1, n, k, ans, new ArrayList<Integer>());
        return ans;
        
    }

    void findcomb(int first, int n, int k, List<List<Integer>> ans, ArrayList<Integer> ls){
        if(ls.size() == k){
            ans.add(new LinkedList<>(ls));
        }

        for(int i = first; i <= n ; i++){
           
            ls.add(i);
            findcomb(i + 1, n, k, ans, ls);
            ls.remove(ls.size() - 1);
        }
    }
}