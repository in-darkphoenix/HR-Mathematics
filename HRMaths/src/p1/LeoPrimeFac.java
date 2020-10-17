package p1;

import java.math.BigInteger;

//https://www.hackerrank.com/challenges/leonardo-and-prime/problem

public class LeoPrimeFac {

	public static void main(String[] args) {
		System.out.println(primeCount(10000000000L));

	}

	public static int primeCount(long n) {
		// the approach used such that we take the primorial till the product exceeds
		// the n
		// so we can know the first i prime used so that is the max no. of prime factor.

		int primes[] = { 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53 };
		BigInteger b = new BigInteger("1");
		int i = 0;
		for (; i < 16; i++) {
			b = b.multiply(BigInteger.valueOf(primes[i]));
			if (b.compareTo(BigInteger.valueOf(n)) > 0) {
				return i;
			}
		}
		return i;
	}

}
