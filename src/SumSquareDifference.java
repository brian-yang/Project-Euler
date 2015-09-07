
public class SumSquareDifference {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(squareSum(100) - sumOfSquares(100));
	}

	// Squares the sum of all numbers from 1 to n
	public static int squareSum(int n) {
		return (n * n * (n+1) * (n+1)) / 4;
	}

	// Sums the squares of all numbers from 1 to n
	public static int sumOfSquares(int n) {
		return (n * (n + 1) * ((2 * n) + 1)) / 6;
	}

}
