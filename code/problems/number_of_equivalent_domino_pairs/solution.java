class Solution {
    public int numEquivDominoPairs(int[][] dominoes) {
        
        
        int ans = 0;
        
        Map<String, Integer> map = new HashMap<>();
        
        for(int[] n: dominoes){
            String key = Math.min(n[0], n[1])+""+Math.max(n[0], n[1]);
            ans += map.getOrDefault(key, 0);
            map.put(key,  map.getOrDefault(key, 0) + 1);
        }
        return ans;
        
    }
}