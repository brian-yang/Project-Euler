package projecteuler;
import java.util.ArrayList;

class P26_ReciprocalCycles {
	public static void main(String[] args) {
		int answer = 0;
		int repeat = 0;

		for (int i = 1; i < 1000; i++) {
			if (divide(i) > repeat) {
				answer = i;
				repeat = divide(i);
			}
		}

		System.out.println(answer);
	}

	public static int divide(int div) {
		int dividend;

		if (div < 10) {
			dividend = 10;
		} else {
			dividend = 100;
		}

		ArrayList<Integer> dividends = new ArrayList<Integer>();
		Integer divisor =  new Integer(div);

		while (dividend != 0) {
			if (dividend / divisor.intValue() == 0) {
				dividend = dividend * 10;
			}
			dividend -= (dividend / divisor.intValue()) * divisor.intValue();
			if (dividends.contains(dividend)) {
				break;
			}
			dividends.add(dividend);
		}
		return dividends.size() - dividends.indexOf(dividend);
	}
}