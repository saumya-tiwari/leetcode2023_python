class Solution {
    public String toLowerCase(String str) {
        
       char[] ch = str.toCharArray();
	    for(int i = 0;i<ch.length;i++){
            if(Character.isUpperCase(ch[i])){
            int ascii = (int) ch[i] + 32;
            ch[i] = (char) ascii;
            }
        }
        
        return String.valueOf(ch);
        
    }
}