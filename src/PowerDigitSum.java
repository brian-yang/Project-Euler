import java.math.BigInteger;


public class PowerDigitSum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger number = BigInteger.valueOf(1);
		for (int i = 1; i <= 1000; i++) {
			number = number.multiply(BigInteger.valueOf(2));
		}
		System.out.println(sumDigits(number));
	}

	public static int sumDigits(BigInteger number) {
		int sum = 0;
		String s = number.toString();
		for (int i = 0; i < s.length(); i++) {
			sum += s.charAt(i) - '0';
		}
		return sum;
	}
}
