class Solution {
    public int minDeletions(String s) {
        
        int ans = 0;
        
        int[] count = new int[26];
       
        for(int i = 0; i < s.length(); i++){
            count[s.charAt(i) - 'a']++;          
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        
         for(int i = 0; i < 26; i++){
             if(count[i] > 0)
            pq.add(count[i]);         
        }
        
        while(pq.size() > 1){
            int top = pq.remove();
            
            if(top == pq.peek()){
                if(top != 1)
                    pq.add(top - 1);
                ans++;
            }
            
          
        }
        
        return ans;
        
        
    }
}