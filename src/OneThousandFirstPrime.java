import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OneThousandFirstPrime {

	private static final int PRIME_INDEX = 10001;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(findPrime(PRIME_INDEX));
	}

	/* Sieve of Eratosthenes (modified by ABCD to find 10001st prime
	 * and translated from Python to Java)
	 * Python Code by David Eppstein, UC Irvine, 28 Feb 2002
	 * http://code.activestate.com/recipes/117119/
	 */

	public static long findPrime(int n) {
		Map<Long, List<Long>> primes = new HashMap<Long, List<Long>>();
		List<Long> multiples = new ArrayList<Long>();
		long curP = 2;
		int counter = 1;

		while (counter <= n) {
			if (!primes.containsKey(curP)) {
				multiples = new ArrayList<Long>();
				multiples.add(curP);
				counter++;
				primes.put(curP * curP, multiples);
			} else {
				for (long sp : primes.get(curP)) {
					if (!primes.containsKey(sp + curP)) { // workaround for Python dict's setdefault()
						primes.put(sp + curP, new ArrayList<Long>());
					}
					primes.get(sp + curP).add(sp);
				}
				primes.remove(curP);
			}
			curP += 1;
		}

		/* curP's value after computation is one greater than the expected value
		 * due to curP being incremented at the end of the while loop
		 * so what should be returned is curP - 1
		 */
		return curP - 1;
	}

}
