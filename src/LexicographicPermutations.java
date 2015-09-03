import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;


public class LexicographicPermutations {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// Initialize variables
		BigInteger permutation = BigInteger.valueOf(1_000_000);
		List<Integer> order = new ArrayList<Integer>();
		List<Integer> newOrder = new ArrayList<Integer>();
		for (int i = 0; i <= 9; i++) {
			order.add(i);
		}

		// Find digits of millionth permutation
		for (int i = 9; i >= 0; i--) {
			int iteration = 0;
			BigInteger product = calculateFact(i);
			while (permutation.subtract(product).intValue() > 0) {
				permutation = permutation.subtract(product);
				iteration++;
			}
			newOrder.add(order.get(iteration));
			order.remove(order.get(iteration));
		}

		// Convert List<Integer> to BigInteger
		String number = "";
		for (int I : newOrder) {
			number += String.valueOf(I);
		}
		System.out.println(new BigInteger(number));

	}
	public static BigInteger calculateFact(int number) {
		BigInteger factorial = BigInteger.valueOf(1);
		for (int i = 2; i <= number; i++) {
			factorial = factorial.multiply(BigInteger.valueOf(i));
		}
		return factorial;
	}
}
