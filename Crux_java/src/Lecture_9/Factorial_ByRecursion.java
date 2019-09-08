package Lecture_9;

import java.util.Scanner;

public class Factorial_ByRecursion {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		
		int n = scn.nextInt();
		System.out.println(factorial(n));

	}

	public static int factorial(int n) {

		// Base Case
		if (n == 1) {
			return 1;
		}
		// Smaller Problem
		int fnm1 = factorial(n - 1);

		// Self work
		int fn = fnm1 * n;

		return fn;

	}

	
}
