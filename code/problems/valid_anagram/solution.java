class Solution {
    public boolean isAnagram(String s, String t) {
        
        int len1 = s.length();
        int len2 = t.length();
        
        if(len1 != len2)
            return false;
        
        Map<Character, Integer> countMap = new HashMap<>();
        
        for(int i  = 0; i < len1; i++){
            countMap.put(s.charAt(i), countMap.getOrDefault(s.charAt(i), 0) + 1);
            countMap.put(t.charAt(i), countMap.getOrDefault(t.charAt(i), 0) - 1);
        }
        
        for(int value: countMap.values()){
            if(value != 0 )
                return false;
        }
        
        return true;
        
    }
}