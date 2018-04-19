class Solution {
    public boolean isIsomorphic(String s, String t) {
        Map<String, String> map= new HashMap<>();
        
        int len = s.length();
        
        for(int i = 0; i < len; i++){
            if(!map.containsValue(Character.toString(t.charAt(i))))
            map.put(Character.toString(s.charAt(i)), Character.toString(t.charAt(i)));
        }
        
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i < len; i++){
            str.append(map.get(Character.toString(s.charAt(i))));
        }
     
        return str.toString().equals(t);
    }
}