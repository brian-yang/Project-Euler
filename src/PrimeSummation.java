import java.math.BigInteger;

public class PrimeSummation {

	private static final int LIMIT = 2_000_000;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(sumPrimes(LIMIT));
	}

	public static BigInteger sumPrimes(int n) {
		int[] marked = new int[n];
		BigInteger value = BigInteger.valueOf(3);
		BigInteger s = BigInteger.valueOf(2);
		BigInteger i = BigInteger.valueOf(0);

		while (value.compareTo(BigInteger.valueOf(n)) == -1) { // is less than?
			if (marked[value.intValue()] == 0) {
				s = s.add(value);
				i = value;
				while (i.compareTo(BigInteger.valueOf(n)) == -1) { // is less than?
					marked[i.intValue()] = 1;
					i = i.add(value);
				}
			}
			value = value.add(BigInteger.valueOf(2));
		}
		return s;
	}
}