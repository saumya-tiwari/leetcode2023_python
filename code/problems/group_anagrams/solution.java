class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        
        Map<String, List<String>> map = new HashMap<>();
        
        int[] count = new int[26];
        
        for(String str: strs){
            
            char[] ch = str.toCharArray();
            Arrays.fill(count, 0);
            for(char c: ch) count[c - 'a']++;
            
            StringBuilder sb = new StringBuilder("");
            
            for(int i  = 0; i < 26;i++){
                sb.append("#");
                sb.append(count[i]);
            }
            
            map.putIfAbsent(sb.toString(), new ArrayList<>());
            map.get(sb.toString()).add(str);
        }
        
        return new ArrayList(map.values());
        
    }
}