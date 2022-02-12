class Solution {
    public void reverseString(char[] s) {
        int start  = 0;
        int end = s.length - 1;
        
        int i = 0;
            while(start < end && i < s.length){
                char temp = s[start];
                s[start] = s[end];
                s[end] = temp;
                start++;
                end--;
                i++;
            }
       
    }
}