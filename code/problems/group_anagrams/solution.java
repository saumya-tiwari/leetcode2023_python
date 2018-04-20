class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        
        for(String str: strs){          
            map.computeIfAbsent(sortString(str),k -> new ArrayList<>()).add(str);
        }
        
        List<List<String>> list = new ArrayList<>(map.values());
        return list;
    }
                    
     public String sortString(String str){
         char [] arr = str.toCharArray();
         Arrays.sort(arr);
         return String.valueOf(arr);
     }     
  
}