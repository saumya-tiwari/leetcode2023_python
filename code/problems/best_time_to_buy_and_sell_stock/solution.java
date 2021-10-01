class Solution {
    public int maxProfit(int[] prices) {
        
        int max_profit = 0;
        
        int j = 0;
        
        
        
        for(int i  = 1; i<prices.length; i++){
            int current = prices[j];
            if(current < prices[i]){
                int diff = prices[i] - current;
                max_profit = Math.max(diff, max_profit);
            }else{
                j = i;
            }          
        }
        
        
        
        return max_profit;
        
    }
}