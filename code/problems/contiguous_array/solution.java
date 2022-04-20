class Solution {
    public int findMaxLength(int[] nums) {
        Map<Integer, Integer> map = new HashMap<>(); // <0-1-difference, smallest_index>
        map.put(0, -1);
        
        int res = 0;
        int zeros = 0, ones = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                zeros++;
            } else {
                ones++;
            }
            int diff = zeros - ones;
            if (map.containsKey(diff)) {
                res = Math.max(res, i - map.get(diff));
            }
            map.putIfAbsent(diff, i);
        }
        return res;
    }
}