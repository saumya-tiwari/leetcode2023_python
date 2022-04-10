class Solution {
    
    List<Integer> list = new ArrayList<>();
    
    public int calPoints(String[] ops) {
        
        Stack<Integer> stack = new Stack<>();
        
        for(String str: ops){
            if(str.equals("C"))
                stack.pop();
            else if(str.equals("D"))
                stack.push(stack.peek() * 2);
            else if(str.equals("+")){
                int top = stack.pop();
                int newtop = top + stack.peek();
                stack.push(top);
                stack.push(newtop);
                
            }else
                stack.push(Integer.valueOf(str));
        }
        
        
        int sum  = 0;
        
        while(stack.size() > 0)
            sum += stack.pop();
        
        return sum;
        
        
        
    }
}