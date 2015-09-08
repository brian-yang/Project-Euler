import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class LargestProductSeries {

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		String line;
		String number; // 1000-digit number
		String subN; // substring of number
		int lower, upper; // lower and upper bounds of String number to find substring
		long product;

		BufferedReader f = new BufferedReader(new FileReader("assets/product1000.txt"));

		number = "";

		while ((line = f.readLine()) != null) {
			number = number.concat(line);
		}
		number = number.replace("\n", "");

		lower = 0;
		upper = 13;
		product = 1;

		while (upper <= number.length()) {
			subN = number.substring(lower, upper);
			if (multiply(subN) > product) {
				product = multiply(subN);
			}
			lower++;
			upper++;
		}
		System.out.println(product);

		f.close();
	}

	public static long multiply(String subS) {
		long product = 1;
		for (int i = 0; i < 13; i++) {
			product *= subS.charAt(i) - '0';
		}
		return product;
	}
}