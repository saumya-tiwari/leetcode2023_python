class Solution {
    
    int rstart;
    int rlength; 
    
    public String longestPalindrome(String s) {
        
        if(s.length() < 2){
            return s;
        }
        
        for(int i = 0; i < s.length(); i++){
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        
        return s.substring(rstart, rstart + rlength);
        
    }
    
    void expand(String s, int start, int end){
        
        while(start >= 0 && end < s.length() && s.charAt(start) ==  s.charAt(end)){
            start--;
            end++;
        }
        
        if(rlength < end - start - 1){
            rstart = start +  1;
            rlength = end - start - 1;
        }
    }
    
    
}