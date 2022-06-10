class Solution {
    public int lengthOfLongestSubstring(String s) {
        
        int start = 0;
        int len = 0;
        
        Map<Character, Integer> map = new HashMap<>();
        
        
        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(map.containsKey(c)){
                if(map.get(c) >= start){
                    start = map.get(c) + 1 ;
                }
            }
            
            len = Math.max(len, i - start + 1);
            map.put(c, i);
        }
        
        return len;
        
    }
}