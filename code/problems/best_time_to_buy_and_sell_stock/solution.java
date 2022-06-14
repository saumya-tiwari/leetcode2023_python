class Solution {
    public int maxProfit(int[] prices) {
        
        int current = Integer.MAX_VALUE;
        int max_profit = 0;
        
        for(int price: prices){
            current = Math.min(current, price);
            max_profit = Math.max(max_profit, price - current);
        }
        
        return max_profit;
    }
}