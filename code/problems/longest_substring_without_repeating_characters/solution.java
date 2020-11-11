class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        Map<Character, Integer> map = new HashMap<>();
       
     
        int ans = 0;
    
        
        int n = s.length();
        if(n == 0)
            return n;
        
        for(int i = 0,j=0; j< n; j++){
            if(map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j - i);
            map.put(s.charAt(j),j+1);
        }    
    return ans+1;
        
        
    }
}