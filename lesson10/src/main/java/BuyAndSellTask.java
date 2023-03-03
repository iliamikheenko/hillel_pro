public class BuyAndSellTask {
        public int maxProfit(int[] prices) {
            int result = 0;
            int firstInt = Integer.MAX_VALUE;
            for(int i = 0; i < prices.length; i++){
                if (prices[i] < firstInt){
                    firstInt = prices[i];
                }
                if (prices[i] > firstInt){
                    result = Math.max(prices[i] - firstInt, result);
                }
            }
            return result;
        }
}
