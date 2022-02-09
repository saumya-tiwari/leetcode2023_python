class Solution {
    
    Map<Integer, Integer> cache = new HashMap<>();
    public int fib(int n) {
        
       if(cache.get(n) != null)
           return cache.get(n);
        
        int value = 0;
        
        if(n < 2)
            return n;
        else
            value = fib(n -1) + fib(n - 2);
        
        cache.put(n ,  value);
        return value;
        
    }
}