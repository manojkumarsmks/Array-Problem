// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BuyAndSellStocks {

	public static void main(String[] args) {
		int[] prices = {7,1,5,3,6,4};
		
		System.out.println(maxProfitSolution(prices));
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
	
	
	private static int maxProfitSolution(int[] prices) {
		int maxDifferent = prices[1] - prices[0];
		int minElement = prices[0];
		
		for (int i = 1; i < prices.length; i++) {
		
			if(prices[i] - minElement > maxDifferent) 
				maxDifferent = prices[i] - minElement;
			if(prices[i] < minElement)
				minElement = prices[i];
		}
		
		return maxDifferent;
		
		
	}

}
