package Lecture_16;

import java.util.Arrays;
import java.util.Scanner;

public class TComplexity_SieveOfEratosthenes {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		SOE(n);
	}

	public static void SOE(int n) {

		boolean[] primes = new boolean[n + 1];
		Arrays.fill(primes, true);

		primes[0] = false;
		primes[1] = false;

		for (int table = 2; table * table <= n; table++) {

			if (primes[table] == false) {
				continue;
			}
			for (int mult = 2; table * mult <= n; mult++) {
				primes[table * mult] = false;
			}
		}
		for (int i = 0; i < primes.length; i++) {
			if (primes[i]) {
				System.out.println(i);
			}
		}

	}

}
