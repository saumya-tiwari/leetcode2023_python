class Solution {
    List<String> combinations = new ArrayList<>();
    String digits;
    
    Map<Character, String> charMap = Map.of(
        '2', "abc", '3', "def", '4', "ghi", '5', "jkl", 
        '6', "mno", '7', "pqrs", '8', "tuv", '9', "wxyz");
    
    public List<String> letterCombinations(String digits) {
        this.digits = digits;
          if (digits.length() == 0) {
            return combinations;
        }
         backtrack(0, new StringBuilder());
        return combinations;
    }
    
    void backtrack(int index, StringBuilder combination){
        if(this.digits.length() == combination.length()){
            combinations.add(new String(combination));
            return;
        }
        
        char ch = digits.charAt(index);
        String letter = charMap.get(ch);
        
        for(int i  = 0; i < letter.length(); i++){
            combination.append(letter.charAt(i));
            backtrack(index + 1, combination);
            
            combination.deleteCharAt(combination.length() - 1);
        }
        
        
    }
}