class Solution {
    public String reverseString(String s) {
        char[] ch = s.toCharArray();
        int start =0;
        int end = ch.length-1;
        
        while(start<end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }
        
        return String.valueOf(ch);
    }
}