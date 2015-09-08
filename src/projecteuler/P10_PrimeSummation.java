package projecteuler;

public class P10_PrimeSummation {

	private static final int LIMIT = 2_000_000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// VERSION 1 -- FASTER (~90ms)
		long startTime = System.currentTimeMillis();

		System.out.println(sumPrimesv1(LIMIT));

		long endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);

		// VERSION 2 (~500ms)
		startTime = System.currentTimeMillis();

		System.out.println(sumPrimesv2(LIMIT));

		endTime = System.currentTimeMillis();
		System.out.println(endTime - startTime);
	}

	// VERSION 1 - SIEVE OF ERATOSTHENES
	public static long sumPrimesv1(int n) {
		int[] marked = new int[n];
		int value = 3;
		long s = 2;
		int i = 0;

		while (value < n) {
			if (marked[value] == 0) {
				s += value;
				i = value;
				while (i < n) {
					marked[i] = 1;
					i += value;
				}
			}
			value += 2;
		}
		return s;
	}

	// VERSION 2 - BRUTE FORCE OPTIMIZED
	public static long sumPrimesv2(int n) {

		// variables
		long result = 0;

		// algorithm
		for (int number = 0; number < n; number++) {
			if (isPrime(number)) {
				result += number;
			}
		}
		return result;
	}

	// functions
	// checks if a number is a prime
	public static boolean isPrime(int number) {
		if (number < 2) {
			return false;
		} else if (number == 2) {
			return true;
		} else if (number % 2 == 0) {
			return false;
		} else {
			for (int divisor = 3; divisor <= Math.sqrt(number); divisor += 2) {
				if (number % divisor == 0) {
					return false;
				}
			}
			return true;
		}
	}
}