class Solution {

    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        Map<Integer, Integer> count = new HashMap<>();

        for (int n : nums) {
            count.put(n, count.getOrDefault(n, 0) + 1);
        }
        backtrack(new ArrayList<>(), nums, count);
      
        return res;
    }

    void backtrack(List<Integer> list, int[] nums, Map<Integer, Integer> count) {
        if (list.size() == nums.length) {
            res.add(new ArrayList<>(list));
            return;
        }

        for (int key: count.keySet()) {
              if(count.get(key) > 0){
                  list.add(key);
                  count.put(key, count.get(key) - 1);
                  backtrack(list, nums, count);
                  
                  count.put(key, count.get(key) + 1);
                  list.remove(list.size() - 1);
                  
                  
              }
                  
            }

          
        }
    }

