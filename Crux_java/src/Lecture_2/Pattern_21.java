/*
 
5
*               * 
* *           * * 
* * *       * * * 
* * * *   * * * * 
* * * * * * * * * 

 */


package Lecture_2;

import java.util.Scanner;

public class Pattern_21 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = 1;
		int nsp = 2 * n - 3;

		// Rows
		int row = 1;

		while (row <= n) {
			// Work

			// Stars
			int cst = 1;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}
			// spaces
			int csp = 1;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// Stars
			cst = 1;
			if (row == n)
				cst = 2;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Prep

			nst++;
			nsp -= 2;
			System.out.println();
			row++;
		}

	}

}

