class Solution {
    public List<String> generateParenthesis(int n) {
        
        List<String> res = new ArrayList<>();
        
        gen(n - 1, n, "(", res);
        
        return res;
        
        
    }
    
    public void gen(int open, int closed, String op, List<String> res){
        
        if(open == 0 && closed == 0){
             res.add(op);
            return;
        }
             
        if(open != 0){
            String op1 = new String(op);
            op1 = op1 + "(";   
            gen(open - 1, closed, op1, res);           
        } 
        if(closed > open){
             String op1 = new String(op);
             op1 = op1 + ")";
             gen(open, closed - 1, op1, res);
        }
    }
}