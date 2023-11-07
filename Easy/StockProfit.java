package Easy;

public class StockProfit {

	public static void main(String[] args) {
		System.out.println(maxProfit(new int[] {15,11,5,20,7}));
	}
	public static int maxProfit(int[] prices) {
        int buy = prices[0];
        int profit =0;
        for(int i=0;i<prices.length;i++){
            buy = (buy < prices[i]) ? buy : prices[i];
            profit = (profit < prices[i] - buy) ? prices[i] - buy : profit;
        }
        return profit;
    }
}
