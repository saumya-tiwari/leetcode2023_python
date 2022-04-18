class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    int[] cost;
    public int minCostClimbingStairs(int[] cost) {
        this.cost = cost;
        return dp(cost.length);   
    }
    
    public int dp(int i){
        if(i <= 1)
            return 0;
        
        if(!cache.containsKey(i)){
            cache.put(i, Math.min(dp(i - 1) + cost[i - 1], dp(i - 2)+ cost[i - 2]));
            return cache.get(i);
        }
        return cache.get(i);
    }
}