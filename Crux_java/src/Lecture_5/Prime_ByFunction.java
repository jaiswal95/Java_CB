package Lecture_5;

import java.util.Scanner;

public class Prime_ByFunction {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {

		int n1 = scn.nextInt();
		int n2 = scn.nextInt();

		printAllprimes(n1, n2);

	}

	public static void printAllprimes(int lo, int hi) {
		for (int i = lo; i <= hi; i++) {
			boolean res = isPrime(i);
			if (res == true) {
				System.out.println(i);
			}
		}

	}

	public static boolean isPrime(int n) {
		int flag = 0;
		int count = 2;
		while (count <= n - 1) {
			if (n % count == 0) {
				flag = 1;
				break;
			}
			count++;
		}
		if (flag == 0) {
			return true;
		} else {
			return false;
		}

	}
}
