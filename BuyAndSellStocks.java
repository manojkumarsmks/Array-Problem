// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = {7,6,4,3,1};
		
		System.out.println(maxProfit(prices));
	}

	private static int maxProfit(int[] prices) {
		
		int max = Integer.MAX_VALUE;
		
		for (int i = 0; i < prices.length; i++) {
			
			for (int j = i+1; j < prices.length; j++) {
				if(prices[i]-prices[j] < max)
					max = prices[i]-prices[j];
			}
			
		}
		
		if(max>=0)
			return 0;
		
		return Math.abs(max);
	}

}
