package p1;
//https://www.hackerrank.com/challenges/handshake/problem

public class Handshake {

	public static void main(String[] args) {
		System.out.println(handshake(1));

	}

	public static int handshake(int n) {
		return (n * (n - 1)) / 2;
	}

}
