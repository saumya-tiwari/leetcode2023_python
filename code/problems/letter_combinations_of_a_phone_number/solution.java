class Solution {
    
    Map<String,String> map = new HashMap<>();
    public List<String> letterCombinations(String digits) {
        
       
         map.put("2","abc");
         map.put("3","def");
         map.put("4","ghi");
         map.put("5","jkl");
         map.put("6","mno");
         map.put("7","pqrs");
         map.put("8","tuv");
         map.put("9","wxyz");
        
        List<String> result = new ArrayList<>();
        
         if(digits.length() == 0)
             return result;
               
        findCombinations(result, new StringBuilder(), digits, 0);      
        return result;
        
    }
    
    private void findCombinations(List<String> res, StringBuilder str, String digits, int index){
        if(digits.length() == str.length()){
            res.add(str.toString());
            return;
        }
        
        String key = map.get(String.valueOf(digits.charAt(index)));
        
        for(char c: key.toCharArray()){
            str.append(c);
            findCombinations(res, str, digits, index + 1);          
            str.deleteCharAt(str.length() - 1);        
            
        }
        
    }
}