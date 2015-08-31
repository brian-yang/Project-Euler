/**
 *
 * @author ABCD
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class GridProduct {
	public static void main(String[] args) throws IOException{

		BufferedReader f = new BufferedReader(new FileReader("/home/brian/workspace/Project-Euler/assets/grid.txt"));
		// input file name goes above
		String[] line;

		// Creates the grid
		int[][] grid = new int[20][20];

		// Stores the numbers into the grid
		for (int row = 0; row < 20; row++) {
			line = f.readLine().split("\\s+");
			for (int column = 0; column < 20; column++) {
				System.out.println(line[column]);
				grid[row][column] = Integer.parseInt(line[column]);
				System.out.println(grid[row][column]);
			}
		}

		System.out.println();


		System.out.println(getGridProduct(grid));

		f.close();
	}

	public static int getGridProduct (int[][] grid) {

		int greatestProduct = 0;

		// Vertical
		for (int column = 0; column < 17; column++) {

			for (int row = 0; row < 20; row++) {
				int product = grid[row][column] * grid[row][column + 1] * grid[row][column+2] * grid[row][column+3];
				if (product > greatestProduct) {greatestProduct = product;}
			}
		}


		// Horizontal
		for (int row = 0; row < 17; row++) {

			for (int column = 0; column < 20; column++) {
				int product = grid[row][column] * grid[row+1][column] * grid[row+2][column] * grid[row+3][column];
				if (product > greatestProduct) {greatestProduct = product;}
			}
		}

		// Diagonal Left
		for (int row = 0; row < 17; row++) {

			for (int column = 0; column < 17; column++) {
				int product = grid[row][column] * grid[row+1][column+1] * grid[row+2][column+2] * grid[row+3][column+3];
				if (product > greatestProduct) {greatestProduct = product;}
			}
		}

		// Diagonal Right
		for (int row = 0; row < 17; row++) {

			for (int column = 19; column > 2; column--) {
				int product = grid[row][column] * grid[row+1][column-1] * grid[row+2][column-2] * grid[row+3][column-3];
				if (product > greatestProduct) {greatestProduct = product;}
			}
		}

		return greatestProduct;

	}

}
