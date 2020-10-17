package p1;
//https://www.hackerrank.com/challenges/best-divisor/problem

import java.util.Scanner;

public class BestDivisor {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = 0, d = 0, c = 0;
		for (int i = 0; i <= Math.sqrt(n); i++) {
			if (n % i == 0) {
				if (n / i == i) {
					b = sumD(i);
				} else {
					c = sumD(i);
					d = sumD(n / i);
					if(c==d) {
						
					}

				}
			}
			
		}
	}

	public static int sumD(int n) {
		int sum = 0;
		for (sum = 0; n > 0; sum += n % 10, n /= 10)
			;

		return sum;
	}

}
