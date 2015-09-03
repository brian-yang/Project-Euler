import java.math.BigInteger;


public class FactorialDigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int sum = 0;
		String number = calculateFact(100).toString();
		for (int i = 0; i < number.length(); i++) {
			sum += number.charAt(i) - '0';
		}
		System.out.println(sum);
	}

	public static BigInteger calculateFact(int number) {
		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 2; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}
