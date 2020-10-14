package p1;
//https://www.hackerrank.com/challenges/lowest-triangle/problem

public class MinHtTriangle {

	public static void main(String[] args) {
		System.out.println(lowestTriangle(34, 999877));
		System.out.println(Math.round(11.7647));
		System.out.println(lowestTriangle(17, 100));

	}

	public static int lowestTriangle(int base, int area) {
		double h = 2 * (double) area / (double) base;
		return (int)Math.ceil(h);
	}

}
