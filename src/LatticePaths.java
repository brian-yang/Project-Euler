import java.math.BigInteger;

public class LatticePaths {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// (a + b) choose a -- the formula
		// to find the number of routes
		BigInteger numerator = calculateFact(40);
		BigInteger denominator = calculateFact(20);
		System.out.println(numerator.divide(denominator.multiply(denominator)));
	}

	public static BigInteger calculateFact(int number) {
		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 2; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}

}
