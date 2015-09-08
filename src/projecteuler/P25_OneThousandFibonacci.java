package projecteuler;
import java.math.BigInteger;


public class P25_OneThousandFibonacci {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		BigInteger prev = BigInteger.valueOf(1);
		BigInteger next = BigInteger.valueOf(1);
		BigInteger temp = next;
		int index = 2;
		// Brute force solution
		while (next.toString().length() != 1000) {
			temp = next;
			next = next.add(prev);
			prev = temp;
			index++;
		}
		System.out.println(index);

		// Alternate solution
		System.out.println(fibDigits(1000));
	}

	/* From the Project Euler thread:
	 * A mathematical solution involves Binet's formula,
	 * (more specifically, a simplified version of Binet's formula)
	 * which finds the nth Fibonacci number, [phi ** n / sqrt(5)].
	 * (The brackets denote "nearest integer".)
	 * There is an integer n such that [phi ** n / sqrt(5)] > 10 ** 999,
	 * since 10 ** 999 is the lowest positive integer to have
	 * 1000 digits. By using this inequality, we can find the smallest
	 * possible n for which the nth Fibonacci number has at least 1000 digits.
	 * Below is a function that will calculate the least possible n
	 * for which the nth Fibonacci number contains the desired # of digits.
	 */
	public static int fibDigits(int digits) {
		if (digits < 2) {
			return 1;
		}

		Double phi = (1 + Math.sqrt(5)) / 2;
		Double n = Math.ceil((digits + Math.log10(5) / 2 - 1) / Math.log10(phi)); // Math.ceil rounds to smallest int
		return n.intValue();
	}
	/* -Credits to ke9tv for explaining
	 * -Credits to KaiserK for explaining and providing a Python implementation
	 * of this formula, translated into Java above (the function fibDigits(int digits))
	 */
}
