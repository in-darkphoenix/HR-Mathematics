package p1;

import java.math.BigInteger;
import java.util.Scanner;

public class SherlocknMovingTiles {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int l = scn.nextInt();
		int s1 = scn.nextInt();
		int s2 = scn.nextInt();
		int q = scn.nextInt();
		long[] queries = new long[q];
		for (int i = 0; i < queries.length; i++) {
			queries[i] = scn.nextLong();
		}
		double[] ans = movingTiles(l, s1, s2, queries);
		for (double val : ans) {
			System.out.println(val);
		}
		scn.close();

	}

	public static double[] movingTiles(int l, int s1, int s2, long[] queries) {
		double[] times = new double[queries.length];
		double r2 = Math.sqrt(2);
		for (int i = 0; i < queries.length; i++) {
			double t = Math.abs((r2 * (Math.sqrt(queries[i]) - l)) / (s1 - s2));
			String p20 = String.format("%.20f", t);
			System.out.println(p20);
			times[i] = Double.parseDouble(p20);
		}
		return times;
	}

}
