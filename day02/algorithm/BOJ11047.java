package algorithm;

public class BOJ11047 {

	public static void main(String[] args) {
		int[] coins = {1, 5, 10, 50, 100, 500, 1000, 5000};
		int numCoins = coins.length;
//		numCoins = 8;
//		int[] coins = new int [numCoins];
		int change = 1300;
		
		System.out.println(getMinimumCoins(coins, change));
		
		
	}
	
	public static int getMinimumCoins(int[] coins, int change) {
		int numCoins = 0;
		
		for(int i = coins.length - 1; i >= 0; i--) {
			numCoins += change / coins[i];
			change %= coins[i]; // change = change % coins[i]
			if (change == 0) break;
		}
		
		
		return numCoins;
	}

}
