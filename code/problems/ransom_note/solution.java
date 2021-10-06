class Solution {
    public boolean canConstruct(String s, String t) {
          boolean isAnagram = false;
        
        Map<Character, Integer> charMap = new HashMap<Character,Integer>();
      
      
        
        for(int i = 0; i < t.length(); i++){
            
            if(!charMap.containsKey(t.charAt(i)))
                charMap.put(t.charAt(i), 1);
            else
                charMap.put(t.charAt(i),charMap.get(t.charAt(i)) + 1)    ;
          
        }
        
        for(int i = 0; i < s.length(); i++){
              if(charMap.containsKey(s.charAt(i))){
                  int value = charMap.get(s.charAt(i)) - 1;
                  
                  if(value >=0)
                      charMap.put(s.charAt(i),charMap.get(s.charAt(i)) - 1) ;
                else
                    return false;
              }
            else
                return false; 
        }
        
        return true;   
        
    }
}