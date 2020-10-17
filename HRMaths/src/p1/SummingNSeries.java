package p1;
//https://www.hackerrank.com/challenges/summing-the-n-series/problem

public class SummingNSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = { 4582, 4412, 1715, 3725, 7018, 9735, 6892, 9992, 4806, 2574 };
		for (int i = 0; i < arr.length; i++) {
			System.out.println(summingSeries(arr[i]));
		}

	}

	public static int summingSeries(long n) {
		// modular arithmetic = (ab)%n = (a%n * b%n)%n
		long m = 1000000007L;
		long r = ((n % m) * (n % m)) % m;
		return (int) r;

	}

}
