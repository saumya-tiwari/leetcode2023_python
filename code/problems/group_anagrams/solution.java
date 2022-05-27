class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> charMap = new HashMap<>();
        
        for(String anagram: strs){
            
            char[] charArr = anagram.toCharArray();
            
            Arrays.sort(charArr);
            String key = String.valueOf(charArr);
            
            charMap.putIfAbsent(key, new ArrayList<>());
            charMap.get(key).add(anagram);
            
        }
        
        
        
        return new ArrayList<>(charMap.values());
    }
        
    }
