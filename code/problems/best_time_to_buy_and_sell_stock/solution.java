class Solution {
    public int maxProfit(int[] prices) {
        
        int lowestPrice = Integer.MAX_VALUE;       
        int maxprofit = 0;
        
        for(int i = 0; i< prices.length ;i++){
                  
            if(lowestPrice > prices[i]){
                lowestPrice = prices[i];
             }else if(prices[i] - lowestPrice > maxprofit){
                maxprofit = prices[i] - lowestPrice;
            }
            
        }
        
        return maxprofit;
        
    }
}