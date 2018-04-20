class Solution {
    public int firstUniqChar(String s) {
        Map<String, Integer> charMapping = new LinkedHashMap<>();
        
        for(int i =0; i< s.length();i++){
            if(!charMapping.containsKey(Character.toString(s.charAt(i))))
                charMapping.put(Character.toString(s.charAt(i)),1);
            else
                charMapping.put(Character.toString(s.charAt(i)),charMapping.get(Character.toString(s.charAt(i)))+1);
        }
        
        for(Map.Entry<String, Integer> entry: charMapping.entrySet()){
            if(entry.getValue() == 1)
                return s.indexOf(entry.getKey());
        }
        return -1;
    }
}