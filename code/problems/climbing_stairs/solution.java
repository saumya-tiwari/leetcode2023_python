class Solution {
    Map<Integer, Integer> cache = new HashMap<>();
    public int climbStairs(int n) {
         if(cache.get(n) != null)
           return cache.get(n);
        
        int value = 0;
        
        if(n <= 2)
            value = n;
        else
            value = climbStairs(n -1) + climbStairs(n - 2);
        
        cache.put(n ,  value);
        return value;
    }
}