class Solution {
    public int[] topKFrequent(int[] nums, int k) {
       
        Map<Integer, Integer> count = new HashMap<>();
        
        for(int n: nums){         
           count.put(n, count.getOrDefault(n, 0) + 1);           
        }
        
         Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> count.get(n1) - count.get(n2));
        
        for(int n: count.keySet()){
        heap.add(n);
           if(heap.size() > k)
            heap.poll();
        }
         
    
        
        int arr[] = new int[k];
      
        for(int i = 0; i < k ; i++)
            arr[i] = heap.poll();
        
        return arr;
                
        
    }
}