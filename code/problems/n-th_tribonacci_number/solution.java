class Solution {
    
    Map<Integer, Integer> cache = new HashMap<>();
    public int tribonacci(int n) {
        
        if(n <= 1)
            return n;
        else if(n == 2)
            return 1;
        
        if(!cache.containsKey(n))
            cache.put(n, tribonacci(n -3) + tribonacci(n - 2) + tribonacci(n - 1));
        
        return cache.get(n);
        
    }
}