class Solution {

    public List<List<Integer>> combinationSum3(int k, int n) {
        List<List<Integer>> res = new ArrayList<>();
        backtrack(1, k, n, new ArrayList<Integer>(), res);
        return res;
    }

    public void backtrack(int start, int k, int target, List<Integer> list, List<List<Integer>> res) {
        if (target == 0 && list.size() == k) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int i = start; i <= 9; i++) {
            list.add(i);
            backtrack(i + 1, k, target - i, list, res);

            list.remove(list.size() - 1);
        }
    }

}
