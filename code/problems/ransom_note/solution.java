class Solution {
    public boolean canConstruct(String s, String t) {
         
        if(s.length() > t.length())
            return false;
        
        Map<Character, Integer> magazineCounts = new HashMap<Character,Integer>();
        
        for(char c: t.toCharArray()){       
         magazineCounts.put(c, magazineCounts.getOrDefault(c, 0) + 1);    
        }
        
        for(char c : s.toCharArray()){
            int countMagazines = magazineCounts.getOrDefault(c, 0);
            
            if(countMagazines == 0)
                return false;
            
            magazineCounts.put(c, countMagazines - 1);
            
        }
        
        return true;   
        
    }
}