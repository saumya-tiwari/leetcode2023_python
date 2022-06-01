class Solution {
    public String reverseWords(String s) {
        
        if(s == null || s.length() < 1)return "";
        
        String[] str = s.trim().split(" ");
        
        StringBuilder sb = new StringBuilder();
        
        for(int i = str.length - 1; i >= 0; --i){
            if(!str[i].isEmpty())
                sb.append(str[i]).append(" ");
        }
        
        return sb.toString().trim();
        
    }
}