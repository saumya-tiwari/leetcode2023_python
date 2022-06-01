class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
       Map<String, List<String>> map = new HashMap<>();
        
        for(String anagrams: strs){
            char[] ch = anagrams.toCharArray();
            
            Arrays.sort(ch);
            
            String s = String.valueOf(ch);
            
            map.putIfAbsent(s, new ArrayList<String>());
            map.get(s).add(anagrams);
        }
        
        return new ArrayList<>(map.values());
    }
        
    }
