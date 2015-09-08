package projecteuler;

public class P02_EvenFibonacciNumbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(evenFibs(4_000_000));
	}

	public static long evenFibs(int limit) {
		int index = 3;
		long sum = 0;
		while (binetFormula(index) <= limit) {
			sum +=  binetFormula(index);
			index += 3;
		}
		return sum;
	}
	public static long binetFormula(int n) {
		Double phi = (1 + Math.sqrt(5)) / 2;
		return Math.round(Math.pow(phi, n) / Math.sqrt(5));
	}
}
