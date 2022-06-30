class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> list = new ArrayList<>();
        
        generateParenthesis(list, new StringBuilder(), 0, 0, n);
        
        return list;
        
    }
    
    void generateParenthesis(List<String> list, StringBuilder str, int open, int close, int n){
        if(str.length() == n * 2){
            list.add(new String(str));
            return;
        }
        
        if(open < n){
            str.append("(");
            generateParenthesis(list, str, open + 1, close, n);
            str.deleteCharAt(str.length() - 1);
        }
        
        if(close < open){
            str.append(")");
            generateParenthesis(list, str, open , close + 1, n);
            str.deleteCharAt(str.length() - 1);
        }
    }
}