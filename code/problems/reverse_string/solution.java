class Solution {
    public void reverseString(char[] s) {
        
        int lastChar = s.length - 1;
        int firstChar = 0;
        
        
        while(firstChar < lastChar){
            char temp = s[firstChar];
            s[firstChar] = s[lastChar];
           s[lastChar] = temp;
            firstChar++;
            lastChar--;
            
        }
        
    }
}