package projecteuler;

public class P01_ThreeFiveMultiples {

	private static final int LIMIT = 1000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int threeMultiples = calculateSumMultiples(3, LIMIT);
		int fiveMultiples = calculateSumMultiples(5, LIMIT);
		int fifteeenMultiples = calculateSumMultiples(15, LIMIT);
		System.out.println(threeMultiples + fiveMultiples - fifteeenMultiples);

	}
	public static int calculateSumMultiples(int n, int limit) {
		int highQuotient;

		if (limit % n != 0) {
			limit -= limit % n;
			highQuotient = limit / n;
		} else {
			highQuotient = limit / n - 1;
		}
		return n * (highQuotient + 1) * highQuotient / 2;
	}

}