package p1;
//https://www.hackerrank.com/challenges/connecting-towns/problem

public class ConnectingTowns {

	public static void main(String[] args) {
		System.out.println(connectingTowns(4, new int[] { 3, 4, 5 }));

	}

	public static int connectingTowns(int n, int[] routes) {
		// in every step modulo is done to prevent overflow
		int r = 1;
		for (int i = 0; i < routes.length; i++) {
			r = r * routes[i] % 1234567;
		}
		return r;
	}

}
