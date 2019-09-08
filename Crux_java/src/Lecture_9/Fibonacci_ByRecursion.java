package Lecture_9;

import java.util.Scanner;

public class Fibonacci_ByRecursion {
	
	static Scanner scn = new Scanner(System.in);
	
	public static void main(String[] args) {
		int n = scn.nextInt();
		System.out.println(fibonacci(n));
	}
	
	public static int fibonacci(int n) {

		// Base Case
		if (n == 0 || n == 1) {
			return n;
		}

		// Smaller Problem
		int fnm1 = fibonacci(n - 1);
		int fnm2 = fibonacci(n - 2);

		// Self work
		int fn = fnm1 + fnm2;

		return fn;

	}	

}
