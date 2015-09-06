
public class SpecialPythagoreanTriplet {

	/**
	 * @param args
	 */
	/*
	 Use the general form for primitive Pythagorean
	 triples: (m^2 - n^2, 2mn, m^2 + n^2), otherwise
	 known as sides (a, b, c) of a right triangle
	 where a^2 + b^2 = c^2.

	 Note 1: A primitive Pythagorean triple's three members
	 have no common divisors and are thus relatively prime.
	 Note 2: m > n and both are relatively prime
	 Source: Art of Problem Solving Wiki
	 http://www.artofproblemsolving.com/wiki/index.php/Pythagorean_triple
	 */
	public static void main(String[] args) {
		/*
		a= 2mn; b= m^2 - n^2; c= m^2 + n^2;
		a + b + c = 1000;

		2mn + (m^2 -n^2) + (m^2 + n^2) = 1000;
		2mn + 2m^2 = 1000;
		2m(m+n) = 1000;
		m(m+n) = 500;

		m > n;

		m = 20; n = 5;

		a = 200; b = 375; c = 425;

		Credits to Pier from Project Euler thread
		 */
		System.out.println(200 * 375 * 425);
	}

}
