public class LargestPrimeFactor {

	private static final long PRIME = 600851475143L;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(largestPrimeFactor(PRIME));
	}

	public static long largestPrimeFactor(long n) {
		for (int i = 2; i <= Math.sqrt(n); i++) {
			while (n % i == 0) {
				n /= i;
			}
		}
		return n;
	}
}
