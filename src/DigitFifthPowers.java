import java.math.BigInteger;


public class DigitFifthPowers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int answer = 0;

		for (int i = 10; i < 295245; i++) { // 9^5 * 5 = 295245
			if (sum(i)) {
				answer += i;
			}
		}

		System.out.println(answer);

		// Test cases
		// System.out.println(sum(54748));
		// System.out.println(sum(92727));
		// System.out.println(sum(93084));
	}

	public static boolean sum(int number) {
		String numberStr = Integer.toString(number);
		BigInteger total = BigInteger.valueOf(0);

		for (int i = 0; i < numberStr.length(); i++) {
			Character c = numberStr.charAt(i); // store each digit as a Character
			Integer digit = Character.getNumericValue(c); // convert Character to Integer
			Double powersDouble = new Double(Math.pow(digit, 5)); // calculate sum of powers
			BigInteger powersBigInt = BigInteger.valueOf(powersDouble.intValue()); // convert Double to BigInteger
			total = total.add(powersBigInt); // IMPORTANT: BigIntegers are immutable
		}

		return total.equals(new BigInteger(Integer.toString(number)));
	}
}
