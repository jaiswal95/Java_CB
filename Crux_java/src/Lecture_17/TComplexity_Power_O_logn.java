package Lecture_17;

import java.util.Scanner;

public class TComplexity_Power_O_logn {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int x=scn.nextInt();
		int n=scn.nextInt();
		System.out.println(power(x, n));

	}

	public static int power(int x, int n) {

		if (n == 0) {
			return 1;
		}

		int rr = power(x, n / 2);

		if (n % 2 == 0) {
			return rr * rr;
		} else {
			return rr * rr * x;
		}

	}

}
