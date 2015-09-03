public class QuadraticPrimes {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int max = 0;
		int product = 0;
		// Brute force solution
		for (int a = -999; a < 1000; a++) {
			for (int b = -999; b < 1000; b++) {
				int n = 0;
				while (isPrime(evalQuad(n, a, b))) {
					n++;
				}
				if (n > max) {
					max = n;
					product = a * b;
				}
			}
		}
		System.out.println(product);
	}

	public static int evalQuad(int n, int a, int b) {
		return n * n + a * n + b;
	}

	public static boolean isPrime(int number) {
		if (number < 0) { // Negative numbers are not prime
			return false;
		}
		if (number == 2) {
			return true;
		}
		if (number % 2 == 0) {
			return false;
		}
		for (int i = 3; i <= Math.sqrt(number); i += 2) {
			if (number % i == 0) {
				return false;
			}
		}

		return true;
	}
}