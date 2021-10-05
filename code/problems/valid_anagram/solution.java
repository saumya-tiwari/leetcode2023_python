class Solution {
    public boolean isAnagram(String s, String t) {
        
        boolean isAnagram = false;
        
        Map<Character, Integer> anagramMap1 = new HashMap<Character,Integer>();
        Map<Character, Integer> anagramMap2 = new HashMap<Character,Integer>();
        
      
        
        for(int i = 0; i < s.length(); i++){
            
            if(!anagramMap1.containsKey(s.charAt(i)))
                anagramMap1.put(s.charAt(i), 1);
            else
                anagramMap1.put(s.charAt(i),anagramMap1.get(s.charAt(i)) + 1)    ;
          
        }
        
        for(int i = 0; i < t.length(); i++){
              if(!anagramMap2.containsKey(t.charAt(i)))
                anagramMap2.put(t.charAt(i), 1);
            else
                anagramMap2.put(t.charAt(i),anagramMap2.get(t.charAt(i)) + 1)   ; 
        }
        
        
        return anagramMap2.equals(anagramMap1);
        
    }
}