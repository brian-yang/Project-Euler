package projecteuler;
/**
 * 
 * @author ABCD
 */
public class P21_AmicableNumbers {
	public static void main(String[] args) {
		int amicableSum = 0;

		for (int i = 2; i < 10000; i++) {
			int number = sumOfAmicableDivisors(i);
			if (number != i && sumOfAmicableDivisors(number) == i) {
				amicableSum += i;
			}
		}


		System.out.println(amicableSum);

	}

	public static int sumOfAmicableDivisors(int number) {

		int sum = 1;
		int counter = 2;

		if (Math.sqrt(number) % 1 == 0 && number != 1) {
			sum += Math.sqrt(number);
		}


		while (counter < Math.sqrt(number) && number != 1) {
			if (number % counter == 0) {
				sum += counter;
				sum += number / counter;
			}

			counter++;
		}

		return sum;

	}
}
