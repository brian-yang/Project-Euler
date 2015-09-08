package projecteuler;
/**
 *
 * @author ABCD
 */
public class P19_CountingSundays {
	public static void main(String[] args) {

		Year year = new Year();
		year.day = 2; // day 0 is Sunday
		year.month = 0; // month 0 is January

		boolean leapYear = false;
		int sundays = 0;

		for (int curYear = 1901; curYear <= 2000; curYear++) {
			//check for leap year
			if (isLeapYear(curYear)) {
				leapYear = true;
			} else if (leapYear) {
				leapYear = false;
			}

			// check for Sundays at beginning of each month
			while (year.month < 12) {
				if (year.day == 0) {
					sundays++;
				}
				year.day = (year.day + monthLength(year.month % 12, leapYear)) % 7;
				year.month++;
			}

			// reset
			year.month = 0;
		}
		System.out.println(sundays);

	}

	// makes code more modularized
	static class Year {

		public int day; // day of the week
		public int days; // number of days in a year
		public int month; // current month

		public Year() {};
	}

	// checks if a year is a leap year
	public static boolean isLeapYear(int year) {
		return year % 4 == 0;
	}

	// returns the number of days in a month
	public static int monthLength(int month, boolean leapYear) {
		switch (month) {
		case 0: return 31;
		case 1: return leapYear ? 29 : 28;
		case 2: return 31;
		case 3: return 30;
		case 4: return 31;
		case 5: return 30;
		case 6: return 31;
		case 7: return 31;
		case 8: return 30;
		case 9: return 31;
		case 10: return 30;
		case 11: return 31;
		default: return -1;
		}
	}
}