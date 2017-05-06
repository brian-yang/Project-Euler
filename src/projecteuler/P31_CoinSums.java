package projecteuler;

public class P31_CoinSums {
    public static void main(String[] args) {
	int[] possibleCoinValues = {1, 2, 5, 10, 20, 50, 100, 200};
	int coinSum = 200;

	System.out.println(getCoinCombinations(coinSum, possibleCoinValues, possibleCoinValues.length));
    }

    public static int getCoinCombinations(int sum, int[] values, int num_coins) {
	if (sum < 0 || num_coins <= 0) {
		return 0;
	}
	if (sum == 0) {
	    return 1;
	}

	return getCoinCombinations(sum, values, num_coins - 1) + getCoinCombinations(sum - values[num_coins - 1], values, num_coins);
    }
}
