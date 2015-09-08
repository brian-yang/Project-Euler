package projecteuler;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ABCD
 */
public class P22_NamesScores{
	public static void main(String[] args) throws IOException{

		Scanner input = new Scanner(new File("assets/names.txt"));

		StringTokenizer st;
		ArrayList<String> indList = new ArrayList<String>();

		while (input.hasNextLine()) {
			st = new StringTokenizer(input.nextLine());
			while (st.hasMoreTokens()) {
				indList.add(st.nextToken(",").replace("\"",""));
			}
		}
		Collections.sort(indList, String.CASE_INSENSITIVE_ORDER);

		long score = 0;
		for (String name : indList) {
			score += nameValue(name) * (indList.indexOf(name) + 1);
		}

		System.out.println(score);

		input.close();
	}
	public static int nameValue(String name) {
		int nLength = name.length();
		int nameValue = 0;

		for (int i = 0; i < nLength; i++) {
			nameValue += (name.charAt(i)) - 64; // converts chars to ASCII value
		}

		return nameValue;
	}

}