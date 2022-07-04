class Solution {
    public String reverseParentheses(String s) {
        
        Deque<StringBuilder> levels = new ArrayDeque<>();
        
        levels.push(new StringBuilder());
        
        for(int i = 0; i < s.length(); i++){
            if(s.charAt(i) == '('){
                levels.push(new StringBuilder());
            }else if(s.charAt(i) == ')'){
                StringBuilder sb = levels.pop().reverse();
                levels.peek().append(sb);
            }else{
                levels.peek().append(s.charAt(i));
            }
        }
        
        return levels.pop().toString();
        
    }
}