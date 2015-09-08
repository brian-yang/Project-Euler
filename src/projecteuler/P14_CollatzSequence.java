package projecteuler;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ABCD
 */
public class P14_CollatzSequence {
	public static void main(String[] args) {

		double bigCollatz = 3;
		double bigCollatzSequence = 8;
		double currentSequence;

		Map<Double, Double> dictionary = new HashMap<Double,Double>();

		dictionary.put(bigCollatz, bigCollatzSequence);

		for (double i = 3; i < 1000000; i++) {

			if (i == 4 || i == 8 || i == 16) {
				continue;
			} else {
				currentSequence = getCollatz(i, dictionary);
				dictionary.put(i, currentSequence);
				if (currentSequence > bigCollatzSequence) {
					bigCollatz = i;
					bigCollatzSequence = currentSequence;
				}
			}
		}

		System.out.println(bigCollatz);


	}

	public static double getCollatz(double number, Map<Double, Double> collatzKeeper) {

		double counter = 1;

		while (number != 1) {
			if (collatzKeeper.containsKey(number)) {
				counter += collatzKeeper.get(number) - 1;
				break;
			} else if (number % 2 == 0) {
				number /= 2;
			} else {
				number = 3 * number + 1;
			}

			counter++;
		}

		return counter;

	}

}
