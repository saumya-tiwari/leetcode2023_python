class Solution {
    public boolean isValid(String s) {
        
        Stack<Character> stack = new Stack<Character>();
        
        if(s.length() % 2 != 0) return false;
      
        
         for(char c : s.toCharArray()){
           if(c == '(' || c == '{' || c == '[' )
               stack.push(c);
             else if(!stack.isEmpty() && stack.peek() == '(' && c == ')')
                 stack.pop();
              else if(!stack.isEmpty() && stack.peek() == '[' && c == ']')
                 stack.pop();
              else if( !stack.isEmpty() && stack.peek() == '{' && c == '}')
                 stack.pop();
             else
                stack.push(c);
    }
        
        
        return stack.isEmpty();
        
        
            
        
    }
}