class Solution {
    public int maxProfit(int[] prices) {
        
      int lsp = Integer.MAX_VALUE;
      int profit = 0;
      int max_profit  = 0;
        
      for(int n: prices){
          if(n < lsp)
              lsp = n;
          
          profit = n - lsp;
          
          if(max_profit < profit)
              max_profit = profit;
      }
        
        return max_profit;
        
    }
}