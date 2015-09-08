package projecteuler;
public class P17_NumberCounts {

	private static final int[] ONES = {3, 3, 5, 4, 4, 3, 5, 5, 4}; // digits
	private static final int[] TEN_TO_NINETEEN = {3, 6, 6, 8, 8, 7, 7, 9, 8, 8}; // 10-19
	private static final int[] TENS = {6, 6, 5, 5, 5, 7, 6, 6}; // multiples of ten excluding 10

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		sum += calculateHundreds() + "onethousand".length();
		System.out.println(sum);
	}

	// calculates sum of letters for numbers 001-999
	public static int calculateHundreds() {
		int sum = 100 * calculateOnes();
		sum += 900 * "hundred".length();
		sum += 891 * "and".length();
		sum += 10 * calculateTens();
		return sum;
	}

	// calculates sum of letters for numbers 01-99
	public static int calculateTens() {
		int sum = arraySum(ONES) + arraySum(TEN_TO_NINETEEN); // 01-19
		for (int a = 0; a < 8; a++) { // 20-99
			sum += 10 * TENS[a] + calculateOnes();
		}
		return sum;
	}

	// calculates sum of letters for numbers 1-9
	public static int calculateOnes() {
		int sum = arraySum(ONES);
		return sum;
	}

	// calculates sum of all numbers in integer array
	public static int arraySum(int[] arr) {
		int sum = 0;
		for (int i : arr) {
			sum += i;
		}
		return sum;
	}

}
