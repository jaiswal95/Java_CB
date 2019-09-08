package Lecture_9;

import java.util.Scanner;

public class PowerRaised_ByRecursion {

	static Scanner scn = new Scanner(System.in);

	public static void main(String[] args) {
		    int n = scn.nextInt();
		    int power = scn.nextInt();
		    System.out.println(Power(n, power));
	}
	
	public static int Power(int n, int power) {

		// Base Case
		if (power == 0) {
			return 1;
		}
		// Smaller Problem
		int Pnm1 = Power(n, power - 1);

		// Self Work
		int Pn = Pnm1 * n;

		return Pn;

	}

}
