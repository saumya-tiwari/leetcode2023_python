class Solution {
    public List<List<String>> groupStrings(String[] strings) {
        Map<String, List<String>> map = new LinkedHashMap<>();
        
        for(String str: strings){
            map.computeIfAbsent(getKey(str), k -> new ArrayList<>()).add(str);
        } 
         
        return new ArrayList<>(map.values());
        
    }
    
    String getKey(String s){
        char [] c = s.toCharArray();
        String key = "0,";
        for(int i =1; i <c.length;i++){
            int diff = c[i] - c[i-1];
            key += diff < 0 ? diff + 26 : diff;
            key += ",";   
        }
        return key;
    }
}