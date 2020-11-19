class Solution {
    public String removeVowels(String S) {
        
        String ans = "";
        
        char[] ch = new char[5];
        
        for(int i = 0;i < S.length(); i++){
            if(!(S.charAt(i) == 'a' || S.charAt(i) == 'e' || S.charAt(i) == 'i' ||S.charAt(i) == 'o' ||S.charAt(i) == 'u'))
                ans += S.charAt(i);
        }
        
        return ans;
        
    }
}