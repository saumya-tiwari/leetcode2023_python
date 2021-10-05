class Solution {
    public int firstUniqChar(String s) {
        
        int index = -1;
        
     
        
        Map<Character, Integer> map = new LinkedHashMap<>();
        
        
        for(int i = 0; i < s.length(); i++){
            
            if(!map.containsKey(s.charAt(i)))
                 map.put(s.charAt(i), 1);
            else
               map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
        }
        
        
         for(Map.Entry<Character, Integer> entry: map.entrySet()){
            
             if(entry.getValue() == 1){
                index = s.indexOf(entry.getKey());
                 return index;
             }
             
            
        }
        return index;
        
    }
}