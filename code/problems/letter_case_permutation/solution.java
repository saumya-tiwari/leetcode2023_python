class Solution {
    public List<String> letterCasePermutation(String s) {
        
        List<String> result = new ArrayList<>();
        
        String op = "";
        
        find(s, op, result);
        
        return result;
        
    }
    
    void find(String ip, String op, List<String> result){
        
        if(ip.length() == 0){
            result.add(op);
            return;
        }
        
        String op1 = new String(op);
        String op2 = new String(op);
        
         //op1 = op1 + Character.toString(ip.charAt(0));
        
        if(Character.isDigit(ip.charAt(0))){
            op1 = op1 + Character.toString(ip.charAt(0));
            ip = ip.substring(1);
            find(ip, op1, result);
        }else{
            op1 = op1 + Character.toString(ip.charAt(0)).toLowerCase();
             op2 = op2 + Character.toString(ip.charAt(0)).toUpperCase();
              ip = ip.substring(1);
               find(ip, op1, result);
        find(ip, op2, result);
        }
        
       
      
        
    }
}