/*
 
5
* * * * * * * * * 
* * * *   * * * * 
* * *       * * * 
* *           * * 
*               * 
 
 */

package Lecture_2;

import java.util.Scanner;

public class Pattern_22 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();

		int nst = n;
		int nsp = 0;

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
			int csp = 2;
			while (csp <= nsp) {
				System.out.print("  ");
				csp++;
			}
			// Stars
			cst = 1;
			if (row == 1)
				cst = 2;
			while (cst <= nst) {
				System.out.print("* ");
				cst++;
			}

			// Prep

			nst--;
			nsp += 2;
			System.out.println();
			row++;
		}

	}

}
