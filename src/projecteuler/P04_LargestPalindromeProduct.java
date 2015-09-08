package projecteuler;
public class P04_LargestPalindromeProduct {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println(greatestPalindrome());
	}

	public static int greatestPalindrome() {
		int product = 1;

		for (int a = 999; a >= 100; a--) {
			for (int b = 990; b >= 100; b -= 11) {
				if (isPalindrome(a * b) && a * b > product) {
					product = a * b;
				}
			}
		}
		return product;
	}

	public static boolean isPalindrome(int n) {
		String half1;
		StringBuilder half2;
		String number = Integer.toString(n);

		half1 = number.substring(0, number.length() / 2);
		if (number.length() % 2 == 0) {
			half2 = new StringBuilder(number.substring(number.length() / 2, number.length()));
			half2.reverse();
		} else {
			half2 = new StringBuilder(number.substring(number.length() / 2 + 1, number.length()));
			half2.reverse();
		}

		return half1.equals(half2.toString());
	}

}