/**
 *
 * @author ABCD
 */
public class DivisibleTriangularNumber {

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) {

		double triangularNumber = 28;
		double increment = 8;

		while (getNumDivisors(triangularNumber) <= 500) {
			triangularNumber += increment;
			increment++;
		}

		System.out.println(triangularNumber);
	}

	public static int getNumDivisors(double number) {

		int counter = 0;

		for (int i = 1; i <= Math.sqrt(number); i++) {
			if (number % i == 0) {
				counter += 2;
			}
		}

		return counter;
	}

}
