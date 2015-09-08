package projecteuler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;

/**
 *
 * @author ABCD
 */
public class P29_DistinctPowers {
	public static void main(String[] args) {
		List<Integer> a = new ArrayList<Integer>();
		List<Integer> b = new ArrayList<Integer>();
		for (int i = 2; i <= 100; i++) {
			a.add(i);
			b.add(i);
		}
		List<Double> c = new ArrayList<Double>();
		for (int numA : a) {
			for (int numB: b) {
				double m = Math.pow(numA, numB);
				c.add(m);
			}
		}
		Collections.sort(c);
		c = new ArrayList<Double>(new LinkedHashSet<Double>(c));
		System.out.println(c.size());
	}
}
