import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

/**
 *
 * @author ABCD
 */
public class PathSumI {
	public static void main(String[] args) throws IOException{
		Scanner input = new Scanner(new File("assets/pascal.txt"));

		ArrayList<ArrayList<Integer>> triangle = new ArrayList<ArrayList<Integer>>();

		StringTokenizer st;
		ArrayList<Integer> row = new ArrayList<Integer>();

		while (input.hasNextLine()) {
			st = new StringTokenizer(input.nextLine());
			while (st.hasMoreTokens()) {
				row.add(Integer.parseInt(st.nextToken()));
			}
			triangle.add(row);
			row = new ArrayList<Integer>();
		}

		int indexTriangle = triangle.size() - 1;

		while (indexTriangle - 1 >= 0) {
			triangle.add(indexTriangle - 1, compareRows(triangle.get(indexTriangle -1), triangle.get(indexTriangle)));
			triangle.remove(indexTriangle);
			indexTriangle--;
		}
		System.out.println(triangle);

		input.close();
	}
	public static ArrayList<Integer> compareRows(ArrayList<Integer> rowA, ArrayList<Integer> rowB) {

		int indexA = 0;
		int indexB = 0;

		while (indexA < rowA.size()) {
			int inc = Math.max(rowB.get(indexB), rowB.get(indexB + 1));
			int newElement = rowA.get(indexA) + inc;
			rowA.remove(indexA);
			rowA.add(indexA, newElement);
			indexA++;
			indexB++;
		}

		return rowA;
	}

}