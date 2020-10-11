package p1;
//https://www.hackerrank.com/challenges/p1-paper-cutting/problem

public class CuttingPaper {

	public static void main(String[] args) {
		System.out.println(solve1(689715240, 759842301));

	}

	public static long solve1(int n, int m) {
		// its all about handling large numbers
		if (n == 1 || m == 1) {
			if (n == 1) {
				return m - 1;
			} else {
				return n - 1;
			}
		}
		if (n > m) {
			return (long) (m - 1) + (long) m * (long) (n - 1);
		} else {
			return (long) (n - 1) + (long) n * (long) (m - 1);
		}

	}

	public static long solve(int n, int m) {
		return ((long) n * (long) m) - 1;

	}

}
