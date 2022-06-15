class Solution {
    public int longestStrChain(String[] words) {
        
        Map<String, Integer> dp = new HashMap<>();
        
        Arrays.sort(words, (a, b) -> a.length() - b.length());
        
        int maxLen = 1;
        
        
        for(String word: words){
            
            int presentLen = 1;
            
            for(int i  = 0; i < word.length(); i++){
                StringBuilder sb = new StringBuilder(word);
                sb.deleteCharAt(i);
                
                String pre = sb.toString();
                
                int preLen = dp.getOrDefault(pre, 0);
                presentLen = Math.max(preLen + 1, presentLen);
            }
            
            dp.put(word, presentLen);
            maxLen = Math.max(maxLen, presentLen);
        }
        
        return maxLen;
        
    }
}