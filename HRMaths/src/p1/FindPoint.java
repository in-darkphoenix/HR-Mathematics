package p1;
//https://www.hackerrank.com/challenges/find-point/problem

public class FindPoint {

	public static void main(String[] args) {

	}

	public static int[] findPoint(int px, int py, int qx, int qy) {
		// mid point approach
		int[] arr = new int[2];
		arr[0] = 2 * qx - px;
		arr[1] = 2 * qy - py;
		return arr;
	}

}
