package ejercicio20230619;

public class TimeToSellStock {

	public static void main(String[] args) {
		
		System.out.println(maxProfit(new int[] {1,2}));

	}

	
	public static int maxProfit(int[] prices) {
		int profit = 0;
        int iBuy = 0;
        for(int i=0;i<prices.length;i++){
            if(prices[iBuy] > prices[i]) iBuy = i;
            profit = Math.max(profit, prices[i] - prices[iBuy]);
        }
        return profit;
		
    }
	
	
}
