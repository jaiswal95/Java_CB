package Lecture_16;

import java.util.Scanner;

public class TComplexity_Polynomial_O_n {
	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		int n = scn.nextInt();
		int x = scn.nextInt();
		System.out.println(polynomial(n, x));

	}

	public static int polynomial(int n, int x) {

		int coeff = n;
		int mul = x;

		int sum = 0;

		while (coeff >= 1) {

			sum += coeff * mul;
			coeff--;
			mul = mul * x;
		}
		return sum;
	}

}
