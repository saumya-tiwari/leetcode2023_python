class Solution {
    public int longestCommonSubsequence(String text1, String text2) {
        
        int m = text1.length();
        int n = text2.length();
        
        int[][] dp = new int[m + 1][n + 1];
        
        for(int i  = 0; i <= m; i++){
            for(int j = 0; j <= n; j++){
                dp[i][j] = -1;
            }
        }
        return findLCS(text1, m, text2, n, dp);
    }
    
    int findLCS(String text1, int m, String text2, int n, int[][] dp){
        if(m == 0|| n == 0)
            return 0;
        
        if(dp[m][n] < 0){
            
            if(text1.charAt(m - 1) == text2.charAt(n - 1)){
                dp[m][n] = 1 + findLCS(text1, m - 1, text2, n - 1, dp);
            }else{
                dp[m][n] = Math.max(findLCS(text1, m - 1, text2, n , dp), findLCS(text1, m , text2, n - 1, dp));
            }
        }
        
        return dp[m][n];
    }
}