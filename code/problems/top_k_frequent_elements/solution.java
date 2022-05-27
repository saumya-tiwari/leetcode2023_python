class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        
        Map<Integer, Integer> freqMap = new HashMap<>();
        
        for(int n: nums)
            freqMap.put(n, freqMap.getOrDefault(n, 0) + 1);
        
        
        Queue<Integer> q = new PriorityQueue<>((c1, c2) -> freqMap.get(c1) - freqMap.get(c2));
        
        
        for(int n : freqMap.keySet()){
            q.add(n);
            
            if(q.size() > k) q.poll();
        }
        
        int[] res = new int[k];
        
        for(int i = k - 1; i >=0; i--)
            res[i] = q.poll();
        
        return res;
    }
}