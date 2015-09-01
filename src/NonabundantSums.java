import java.util.HashSet;
import java.util.Set;

public class NonabundantSums {

	public static void main(String[] args) {
		int sum = 0;

		// populate sets
		Set<Integer> setA = new HashSet<Integer>();
		for (int i = 1; i <= 20161; i++) {
			setA.add(i);
		}
		Set<Integer> setB = abundantNums();

		// remove sum of two abundant numbers from setA
		for (int a : setB) {
			for (int b : setB) {
				setA.remove(a + b); // automatically checks if set contains element
			}
		}

		// find sum of all numbers remaining within setA
		for (int I : setA) {
			sum += I;
		}
		System.out.println(sum);
	}

	public static Set<Integer> abundantNums() {
		Set<Integer> abundant = new HashSet<Integer>();

		/* Even if 20161 is NOT an abundant number
		 * 20161 + 1 (or any number greater than 1) >= 20162
		 * which can be written as the sum of two abundant numbers
		 * Therefore 20161 will not be checked for abundance
		 */
		for (int i = 1; i < 20161; i++) {
			if (isAbundant(i)) {
				abundant.add(i);
			}
		}

		return abundant;
	}

	public static boolean isAbundant(int number) {
		int divSum = 1;

		// find divisors other than 1 and the number itself
		for (int i = 2; i * i <= number; i++) {
			if (number % i == 0) {
				divSum += i;
				if (number / i != i) {
					divSum += number / i;
				}
			}
		}

		return divSum > number;
	}


}